package metaphysic.mindmapping;

import java.awt.AWTEvent;

/**
 *
 * @author justin
 */
public class ProcessorMessageEvent extends AWTEvent {
	static final long serialVersionUID=1L;
	Processor processor;
	String message;
	/**
     *
     * @param processor
     * @param message
     */
    public ProcessorMessageEvent(Processor processor,String message)
	{
		super(processor,0);
		this.processor=processor;
		this.message=message;
	}
}

