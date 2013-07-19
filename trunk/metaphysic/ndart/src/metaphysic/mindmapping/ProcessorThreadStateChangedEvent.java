package metaphysic.mindmapping;

import java.awt.AWTEvent;

/**
 *
 * @author justin
 */
public class ProcessorThreadStateChangedEvent extends AWTEvent {

	
	static final long serialVersionUID=1L;
	Processor processor;
	ProcessorThread.ProcessorThreadState state;
	
	/**
     *
     * @param processor
     * @param state
     */
    public ProcessorThreadStateChangedEvent(Processor processor,ProcessorThread.ProcessorThreadState state)
	{
		super(processor,0);
		this.processor=processor;
		this.state=state;
	}
}


