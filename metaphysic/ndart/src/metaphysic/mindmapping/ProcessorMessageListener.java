/**
 * 
 */
package metaphysic.mindmapping;

import java.util.EventListener;

/**
 * @author justin
 *
 */
public interface ProcessorMessageListener extends EventListener {
	/**
     *
     * @param e
     */
    public abstract void messageSent(ProcessorMessageEvent e);
}

