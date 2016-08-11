
class SimulationMap(grid: Vector[Vector[Cell]]) {
  override def toString: String = grid.map (line => line mkString " ") mkString "\n"
}
