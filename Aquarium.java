import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {
   public static void main(String[] args) {
   CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

   PainterAPI p = canvas.getPainter();
      canvas.setBackgroundColor(new Color(16, 27, 58)); 
     
      //Beam and UFO and lights
      drawTriangle(300, 500, new Color(152, 255, 152), 0, 200, p);
      drawUFO(new Color(47, 22, 87), 0, 100, 300, p);
      UfoLights(new Color(255, 242, 99), -70, 110, p);
      
      // Moon
      drawCircle(80, new Color(214, 211, 191), 350, -100, p);
      drawCircle(70, new Color(129, 136, 145), 370, -100, p);
      
      
      // Earth Planet
      drawCircle(200, new Color(21, 70, 176), 300, -400, p);
      drawCircle(100, new Color(29, 130, 46), 300, -400, p ); 
      drawCircle(70, new Color(29, 130, 46), 230, -170, p ); 

      // Sun
      drawCircle(80, new Color(232, 133, 46), -280, 80, p);

      //Aliens
      drawAlien(new Color(12, 235, 23), -40, 175, 80, p);
      drawAlien(Color.RED, 40, 185, 100, p);

      //Cows
      drawCow(Color.WHITE, Color.BLACK, 0, 0, 60, p);
      drawCow(new Color(221, 226, 235), Color.BLACK, 300, -200, 100, p);
      
      //stars
      drawStar(new Color(252, 211, 5), 200, 200, 100, p);
      drawStar(new Color(252, 211, 5), -350, -180, 150, p);
      p.turnRight(180);
      drawBunchOfStars(Color.YELLOW, -350, -50, 20, p);

      p.turnLeft(90);
      drawBunchOfStars(Color.YELLOW, 320, 250, 20, p);

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
    * Two aliens of different colors 
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
    drawCircle(size * .05, Color.WHITE, xPos - size * .2 - 2, yPos + size * .3 + 7, p);
    //Right eye  
    drawCircle(size * .1, Color.BLACK, xPos + size * .2, yPos + size * .3, p);
    drawCircle(size * .05, Color.WHITE, xPos + size * .2 - 2, yPos + size * .3 + 7, p);
   }

   /**
    * Draws a cow facing sideways
    * Cow has circle head, and circle body, with black spots
    * four lines(legs) made with for loop. legs will be match color of cow
    * One cow will be inside ufo beam and another smaller cow will be on planet
    * Pink snout on head
    * 
    * @param bodyColor the main color of the cow's body and head and legs
    * @param spotColor the color of the cow's spots
    * @param xPos the X coordinate of cow's center
    * @param yPos the Y coordinate of cow's center
    * @param size overall size of cow
    * @param p the PainterAPI object
    */
   public static void drawCow(Color bodyColor, Color spotColor, double xPos, double yPos, double size, PainterAPI p){
      //legs
      p.setPenColor(bodyColor);
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
    * draws  UFO with a circle dome and trapezoid base.
    *
    * @param color color of UFO's base
    * @param xPos X coordinate of UFO's center
    * @param yPos Y coordinate of UFO's center
    * @param size overall size of UFO
    * @param p PainterAPI object
    **/

   public static void drawUFO(Color color, double xPos, double yPos, double size, PainterAPI p){
      
      drawCircle(size * .45, Color.LIGHT_GRAY, xPos, yPos + size * .05, p);

      double baseY = yPos + size * .05 + 20;
      
      p.setPenColor(color);
      
      setPosition(xPos - size * .5, baseY, p);
      
      p.startFill(color);

      p.moveTo(xPos + size * .5, baseY);
      p.moveTo(xPos + size * .35, baseY - size * .15);
      p.moveTo(xPos - size * .35, baseY - size * .15);
      p.moveTo(xPos - size * .5, baseY);

      p.finishFill();
   }   

   /**
    * draws a five-pointed star at a specified position
    * for loop will be used to draw star's five sides 
    * filled in shape with color of choice
    * 
    * @param color the color of the star
    * @param xPos X coordinate of star
    * @param ypos Y coordinate of star
    * @param size size of star
    * @param p PainterAPi object
    */

   public static void drawStar(Color color, double xPos, double yPos, double size, PainterAPI p){
      setPosition(xPos, yPos, p);
      p.setPenColor(color);
      p.startFill(color);

      for (int i = 0; i < 5; i++){
         p.forward(size);
         p.turnRight(144);
      }

      p.finishFill();
   }

   public static void drawBunchOfStars(Color color, double xPos, double yPos, double size, PainterAPI p){
      for (int i = 0; i < 3; i++){
         if (i == 1){
            drawStar(color, xPos, yPos + 20, size, p);
         } else {
           drawStar(color, xPos, yPos, size, p); 
         }
         xPos += 30;
      }
   }

   public static void UfoLights(Color color, double xPos, double yPos, PainterAPI p){
     for (int i = 0; i < 3; i++){
      drawCircle(8, color, xPos, yPos, p);
      xPos += 70;
     }
      
   }

}
