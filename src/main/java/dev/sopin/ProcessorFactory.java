package dev.sopin;

public class ProcessorFactory {

    private ProcessorFactory() {}

    public static Processor createProcessor(AbstractProcessorFactory factory) {
        return factory.createProcessor();
    }
}
