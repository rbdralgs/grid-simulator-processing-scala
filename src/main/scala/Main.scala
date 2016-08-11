import processing.core.PApplet

class Main extends PApplet {

  override def setup: Unit = {
    val createMap: SimulationMap = MapBuilder.createMap(System.getProperty("user.dir") + "/maps/map.txt")
    println(createMap)
  }
  
  
  override def settings: Unit = {
    size(800, 800)
  }


  override def draw: Unit = {
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("Main"))
  }



}
