package metaphysic.mindmapping;

import java.util.EventListener;

/**
 *
 * @author justin
 */
public interface ProcessorThreadStateChangedListener extends EventListener {
	/**
     *
     * @param e
     */
    public abstract void processorThreadstateChanged(ProcessorThreadStateChangedEvent e);
}
