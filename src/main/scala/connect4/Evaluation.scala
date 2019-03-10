package connect4

/**
  * Used to evaluate game board in given state for given player
  */
trait Evaluation {

    /**
      * Evaluate given grid for given player
      * Returns a positive integer value (0, inclusive). The higher the value the better the situation
      * @param grid
      * @param player
      * @return
      */
    def evaluate(grid: Grid,player: Player) : Int = 0
}
