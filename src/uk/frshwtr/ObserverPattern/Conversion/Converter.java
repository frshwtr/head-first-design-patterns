package uk.frshwtr.ObserverPattern.Conversion;

public interface Converter<A, B>  {
    B convert(A input);
}
