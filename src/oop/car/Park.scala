package oop.car

class Park(car: Car) extends State(car: Car) {
  override def shiftToDrive(): Unit = {
    car.state = new Drive(car)
  }
  override def shiftToPark(): Unit = {
    println("Car in park.")
  }
  override def shiftToReverse(): Unit = {
    car.state = new Reverse(car)
  }
  override def accelerate(): Unit = {
    println("Car in park.")
  }
  override def brake(): Unit = {
    println("Car in park.")
  }
  override def velocity(): Unit = {
    car.speed = 0
  }
}
