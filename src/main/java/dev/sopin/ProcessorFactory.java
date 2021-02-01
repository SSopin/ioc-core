package dev.sopin;

public class ProcessorFactory {
    public static Processor createProcessor(AbstractProcessorFactory factory) {
        return factory.createProcessor();
    }
}
