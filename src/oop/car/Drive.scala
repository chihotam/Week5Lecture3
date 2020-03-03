package oop.car

class Drive(car: Car) extends State(car: Car) {
  override def shiftToDrive(): Unit = {
    println("Car in drive.")
  }
  override def shiftToPark(): Unit = {
    println("Car in drive.")
  }
  override def shiftToReverse(): Unit = {
    println("Car in drive.")
  }
  override def accelerate(): Unit = {
    car.speed += 10
  }
  override def brake(): Unit = {
    car.speed = 0
    car.state = new NDrive(car)
  }
  override def velocity(): Unit = {
    car.speed = car.speed
  }
}
