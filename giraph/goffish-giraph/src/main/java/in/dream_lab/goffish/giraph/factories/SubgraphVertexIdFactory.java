package in.dream_lab.goffish.giraph.factories;

import org.apache.giraph.factories.ValueFactory;
import org.apache.hadoop.io.WritableComparable;

/**
 * Created by anirudh on 25/10/16.
 */
public interface SubgraphVertexIdFactory<I extends WritableComparable> extends ValueFactory<I> {
}
