package entrants.ghosts.matt_barthet;

import pacman.controllers.IndividualGhostController;
import pacman.game.Constants;
import pacman.game.Game;

/**
 * Created by Piers on 11/11/2015.
 */
public class Inky extends IndividualGhostController {


    public Inky() {
        super(Constants.GHOST.BLINKY);
    }


    @Override
    public Constants.MOVE getMove(Game game, long timeDue) {
        return null;
    }

}
