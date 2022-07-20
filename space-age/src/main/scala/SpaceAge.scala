object SpaceAge {

  def onEarth(seconds: Double, orbitalPeriod: Double = 1.0) : Double = (seconds / 31557600) / orbitalPeriod

  def onMercury(seconds: Double) : Double = onEarth(seconds, 0.2408467)

  def onVenus(seconds: Double) : Double = onEarth(seconds, 0.61519726)

  def onMars(seconds: Double) : Double = onEarth(seconds, 1.8808158)

  def onJupiter(seconds: Double) : Double = onEarth(seconds, 11.862615)

  def onSaturn(seconds: Double) : Double = onEarth(seconds, 29.447498)

  def onUranus(seconds: Double) : Double = onEarth(seconds, 84.016846)

  def onNeptune(seconds: Double) : Double = onEarth(seconds, 164.79132)
}