package connect4

import connect4.GridStates.FourInALine

trait DefaultEvaluation extends Evaluation {

    override def evaluate(board: Grid, player: Player): Int = {
        if(board.state == FourInALine)
            if(board.winningDisc == Some(player.disc))
                1000
            else
                0
        else
            500
    }
}
