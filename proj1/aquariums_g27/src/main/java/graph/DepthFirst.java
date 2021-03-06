package graph;

import board.ProvState;
import board.State;

import java.util.List;

/**
 * Used to specify the cost to calculate and to sort according to AStar algo
 */
public class DepthFirst implements Order {
    /**
     * Changes the name of this Student.
     * This may involve a lengthy legal process.
     * @param o1 instane of ProvState.
     * @param o2 instance of ProvState.
     * @return int corresponding to the priority of o1 over o2. Negative if it has, positive if not and 0 if it is the same
     */
    @Override
    public int compare(ProvState o1, ProvState o2) {
        return o2.getDepth() - o1.getDepth();
    }


    @Override
    public void setCostAndHeuristic(State s, List<Integer> h, List<Integer> v) {
        s.updateDepth(h, v);
    }

    @Override
    public String name() {
        return "Depth First";
    }
}
