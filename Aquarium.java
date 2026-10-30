import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {
   public static void main(String[] args) {
   CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

   PainterAPI painter = canvas.getPainter();
      painter.turnRight(10); 
      painter.forward(100);
      painter.circle(50);
   }

   /* Moves painter to specified position without drawing a line
   @param xPos the X coordinate of destination
   @param yPosthe Y coordinate of destination
   @param painter the PainterAPI object
   
  
   public static void setPosition(double xPosition, double yPosition, PainterAPI painter){
   } 
   */

  /*draws filled circle w/ a specified radius and color at given position 
   *@param radius the radius of the circle
   *@param xPos the X coordinate of circle's center
   *@param yPos the Y coordinate of circle's center

   
   public static void drawCircle(double radius, Color color, double xPosition, double yPosition, PainterAPI painter) {
    // Calls setPosition
    //draws circle w circle func
    }
  */
  /* Draws a filled triangle at a specified position
  *Triangle size and color changeable

  @param size the size of the triangle
  @param color the color of the triangle
  @param xPos the X coordinate of the triangle's center
  @param yPos the Y coordinate of triangle center
 
   public static void drawTriangle(double size, Color color, double xPos, double y pos, PainterAPI painter){
   //Calls setPosition
   //loop for triangle
   //fill triangle
   // */

   //*Cow

   //d.drawOval(int x, int y, int width, int height);

   /**
    * draws filled oval w specified width, heigh, and color at given position
    * @param width horizontal width of oval
    * @param height vertical height of oval
    * @param color the color of oval
    * @param xPos X coordinate of oval's center
    * @param yPos Y coordiate of oval's center 
    */
   //  public static void drawOval(double width, double height, Color color, double xPos, double yPos){
   //    //Calls setPosition
   //  }
   
   /**
    * Draws UFO contianing two aliens
    * UFO has oval base, rounded dome 
    * 
    * @param color the color of UFO's base
    * @param xPos x position
    * @param yPos y position
    * @param size the overall size of UFO 
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
