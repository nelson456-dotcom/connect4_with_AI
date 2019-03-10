package connect4

object Discs {
    sealed abstract class Disc(val asciiRepresentation:Char)

    case object Player1 extends Disc('*')
    case object Player2 extends  Disc('-')
}
