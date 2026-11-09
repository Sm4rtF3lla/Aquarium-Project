import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {
   public static void main(String[] args) {
   CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

   PainterAPI p = canvas.getPainter();
      drawTriangle(150, 250, Color.BLUE, 0, 100, p);
      drawAlien(Color.GREEN, -100, 0, 80, p);
      drawAlien(Color.RED, 100, 0, 80, p);
      drawCow(Color.LIGHT_GRAY, Color.BLACK, 110, 110, 60, p);
      drawCow(Color.LIGHT_GRAY, Color.BLACK, -110, -110, 70, p);

   }

   /**
    * Moves p to specified position without drawing a line
    * @param xPos the X coordinate of destination
    * @param yPos the Y coordinate of destination
    * @param p the PainterAPI object
    */

   public static void setPosition(double xPos, double yPos, PainterAPI p){
      p.liftPen();
      p.moveTo(xPos, yPos);
      p.lowerPen();
   } 
   
  /**
   * Draws filled circle w/ a specified radius and color at given position 
   * @param radius the radius of the circle
   * @param color the color of the circle
   * @param xPos the X coordinate of circle's center
   * @param yPos the Y coordinate of circle's center
   * @param p the PainterAPi object
   */
   public static void drawCircle(double radius, Color color, double xPos, double yPos, PainterAPI p) {
    setPosition(xPos, yPos, p);
    p.setPenColor(color);
    p.startFill(color);
    p.circle(radius);
    p.finishFill();
    }
  

  /**
   * Draws a filled isosceles triangle at a specified position, w/ two equal sides and a horizontal base
   * Triangle points upward
   * @param baseWidth width of the triangle's bottom side
   * @param height vertical distance from base to tip
   * @param color the color of the triangle
   * @param xPos the X coordinate of triangle's top vertex
   * @param yPos the Y coordinate of triangle's top vertex 
   * @param p the PainterAPI object
   */
   public static void drawTriangle(double baseWidth, double height, Color color, double xPos, double yPos, PainterAPI p){
      setPosition(xPos, yPos, p);
      p.setPenColor(color);
      p.startFill(color);

      p.moveTo(xPos - baseWidth / 2, yPos - height);
      p.moveTo(xPos + baseWidth / 2, yPos - height);
      p.moveTo(xPos, yPos);
      p.finishFill();
   }

   /**
    * Draws one alien facing front-on
    * Has a rounded head, two black eyes, and a torso
    * Two aliens of different colors will appear inside UFO 
    * @param color main color of alien
    * @param xPos of X cooridnate of alien's center
    * @param yPos the Y coordinate of alien's center
    * @param size the size of the alien
    * @param p the PainterAPI object 
    */
   public static void drawAlien(Color color, double xPos, double yPos, double size, PainterAPI p){
    //Body
    drawCircle(size * .3, color, xPos, yPos - size * .5, p);
    //Head
    drawCircle(size * .4, color, xPos, yPos, p);
    //Left eye
    drawCircle(size * .1, Color.BLACK, xPos - size * .2, yPos + size * .3, p);
    //Right eye  
    drawCircle(size * .1, Color.BLACK, xPos + size * .2, yPos + size * .3, p);
   }

   /**
    * Draws a cow facing sideways
    * Cow has circle head, and oval body, with black spots
    * four lines(legs) and a tail
    * One cow will be inside a tractor beam and another smaller cow will be on planet
    * 
    * @param bodyColor the main color of the cow's body and head
    * @param spotColor the color of the cow's spots
    * @param xPos the X coordinate of cow's center
    * @param yPos the Y coordinate of cow's center
    * @param size overall size of cow
    * @param p the PainterAPI object
    */
   public static void drawCow(Color bodyColor, Color spotColor, double xPos, double yPos, double size, PainterAPI p){
      //legs
      p.setPenColor(Color.BLACK);
      double legX = xPos - size * .3;

      for (int i = 0; i < 4; i++){
        setPosition(legX, yPos + size * .1, p);
        p.moveTo(legX, yPos - size * .3);
      
        
        legX+= size * .2;
      }
      // Main body
      drawCircle(size * .45, bodyColor, xPos, yPos, p);
      //Black Spots
      drawCircle(size * .12, spotColor, xPos - size * .15, yPos + size * .15, p);
      drawCircle(size * .09, spotColor, xPos + size * .15, yPos + size * .5, p); 
      //Head
      drawCircle(size * .25, bodyColor, xPos - size *.45, yPos + size * .15, p);
      //snout
      drawCircle(size * .13, Color.PINK, xPos - size * .65, yPos + size * .15, p);
      //Left eye
      drawCircle(size * .035, Color.BLACK, xPos - size * .5, yPos + size * .4, p);
      //Right eye
      drawCircle(size * .035, Color.BLACK, xPos - size * .6, yPos + size * .4, p);
   }
   
   /**
    * Draws a five-pointed star at a specified position
    * A for loop will be used to draw star's five sides 
    * 
    * @param color the color of the star
    * @param xPos X coordinate of star
    * @param ypos Y coordinate of star
    * @param size size of star
    * @param p PainterAPi object
    */
   public static void drawStar(Color color, double xPos, double yPos, PainterAPI p){
      //calls for setPosition
      //Uses a for loop to draw five-pointed star
   }



   /**
    * Draws UFO contianing two aliens
    * UFO has oval base, rounded dome 
    * 
    * @param color the color of UFO's base
    * @param xPos x position
    * @param yPos y position
    * @param size the overall size of UFO
    * @param p PainterAPI object 
    * 
    * public static void drawUFO(Color color, double xPos, double yPos, double size){
    *    //Calls drawOval
    *    //Calls drawCircle
    *    //Calls drawAlien
    *    //Uses a for to draw UFO 
    * 
    * @param color the color of the UFO's base
    * @param xPos the x pos of ufo center
    * @param size overall size of ufo 
    * @param p the PainterAPI object
   * 
    */

   //public



}
