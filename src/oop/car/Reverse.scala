package oop.car

class Reverse(car: Car) extends State(car: Car) {
  override def shiftToDrive(): Unit = {
    println("Car in reverse.")
  }
  override def shiftToPark(): Unit = {
    println("Car in reverse.")
  }
  override def shiftToReverse(): Unit = {
    println("Car in reverse.")
  }
  override def accelerate(): Unit = {
    car.speed -= 5
  }
  override def brake(): Unit = {
    car.speed = 0
    car.state = new NReverse(car)
  }
  override def velocity(): Unit = {
    car.speed = car.speed
  }
}
