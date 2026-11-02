import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {
   public static void main(String[] args) {
   CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

   PainterAPI painter = canvas.getPainter();
      painter.turnRight(10); 
      painter.forward(100);
      painter.circle(50);
   }

   /**
    * Moves painter to specified position without drawing a line
    * @param xPos the X coordinate of destination
    * @param yPosthe Y coordinate of destination
    * @param painter the PainterAPI object
    */

   public static void setPosition(double xPosition, double yPosition, PainterAPI painter){
   } 
   

  /**
   * Draws filled circle w/ a specified radius and color at given position 
   * @param radius the radius of the circle
   * @param color the color of the circle
   * @param xPos the X coordinate of circle's center
   * @param yPos the Y coordinate of circle's center
   * @param painter the PainterAPi object
   */
   public static void drawCircle(double radius, Color color, double xPos, double yPos, PainterAPI painter) {
    // Calls setPosition
    // Draws circle w circle function
    }
  

  /**
   * Draws a filled isosceles triangle at a specified position, w/ two equal sides and a horizontal base
   * Triangle points upward
   * @param baseWidth width of the triangle's bottom side
   * @param height vertical distance from base to tip
   * @param color the color of the triangle
   * @param xPos the X coordinate of triangle's top vertex
   * @param yPos the Y coordinate of triangle's top vertex 
   * @param painter the PainterAPI object
   */
   public static void drawTriangle(double baseWidth, double height, Color color, double xPos, double yPos, PainterAPI painter){
   //Calls setPosition
   //For loop for triangle's two equal sides
   }

   /**
    * Draws filled oval w specified width, height, and color at given position
    * @param width horizontal width of oval
    * @param height vertical height of oval
    * @param color the color of oval
    * @param xPos X coordinate of oval's center
    * @param yPos Y coordiate of oval's center 
    */
   public static void drawOval(double width, double height, Color color, double xPos, double yPos, PainterAPI painter){
      //Calls setPosition
   }

   /**
    * Draws one alien facing front-on
    * Has a rounded head, two black eyes, and a torso
    * Two aliens of different colors will appear inside UFO 
    * @param color main color of alien
    * @param xPos of X cooridnate of alien's center
    * @param yPos the Y coordinate of alien's center
    * @param size the size of the alien
    * @param painter the PainterAPI object 
    */
   public static void drawAlien(Color color, double xPos, double yPos, double size, PainterAPI painter){
      //Calls drawCircle
      //Calls drawOval
      //Calls setPosition
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
    * @param painter the PainterAPI object
    */
   public static void drawCow(Color bodyColor, Color spotColor, double xPos, double yPos, double size, PainterAPI painter){
      //Calls drawCirlce
      //Calls drawOval
      //Calls setPosition
   }
   
   /**
    * Draws a five-pointed star at a specified position
    * A for loop will be used to draw star's five sides 
    * 
    * @param color the color of the star
    * @param xPos X coordinate of star
    * @param ypos Y coordinate of star
    * @param size size of star
    * @param painter PainterAPi object
    */
   public static void drawStar(Color color, double xPos, double yPos, PainterAPI painter){
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
    * @param painter PainterAPI object 
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
    * @param painter the PainterAPI object
   * 
    */

   //public



}
