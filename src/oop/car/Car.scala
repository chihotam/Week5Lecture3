package oop.car

class Car{
  var state: State = new Park(this)
  var speed: Int = 0
  def shiftToDrive(): Unit = {
    this.state.shiftToDrive()
  }
  def shiftToPark(): Unit = {
    this.state.shiftToPark()
  }
  def shiftToReverse(): Unit = {
    this.state.shiftToReverse()
  }
  def accelerate(): Unit = {
    this.state.accelerate()
  }
  def brake(): Unit = {
    this.state.brake()
  }
  def velocity(): Int = {
    this.state.velocity()
    this.speed
  }
}
