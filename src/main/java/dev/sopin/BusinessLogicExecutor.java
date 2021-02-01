package dev.sopin;

import org.slf4j.Logger;

public abstract class BusinessLogicExecutor {

    /**
     * This function implements main application workflow. It has been
     * intentionally made final, so it cannot be overridden in tenants.
     * In this way we keep execution logic on "core" or "library" side.
     */
    public final void run() {
        // Writing some logs to emulate business logic
        getLogger().info("Starting \"core\" workflow...");

        // Creating processor
        Processor processor = ProcessorFactory.createProcessor(getFactory());

        // Executing processor logic and printing results to logs
        getLogger().info(processor.process());

        // Writing some logs to emulate business logic
        getLogger().info("\"Core\" workflow has been executed successfully!");
    }


    /** getFactory function returns proper implementation of AbstractProcessorFactory,
     * which creates processor. Implementation of both Processor and AbstractProcessorFactory
     * should be done on tenant's side, so this function is supposed to be overridden by
     * tenant implementation.
     *
     * Please note that we could also provide default behaviour.
     */
    protected abstract AbstractProcessorFactory getFactory();

    protected abstract Logger getLogger();
}
