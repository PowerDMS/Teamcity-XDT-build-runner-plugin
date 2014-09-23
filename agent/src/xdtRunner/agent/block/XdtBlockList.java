package xdtRunner.agent.block;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: clement.dagneau
 * Date: 16/12/2011
 * Time: 09:52
 */
public class XdtBlockList {
    static public List<Block> blocks = Arrays.asList(
            new PlayerStatisticsBlock(),
            new CompileBlock(),
            new PrepareBlock(),
            new LightmapBlock(),
            new UpdateBlock()
    );
}
