package no.finn.workshop.javaslang;

import javaslang.control.Either;
import javaslang.control.Option;
import javaslang.control.Try;
import no.finn.workshop.javaslang.things.Triangle;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ForComprehensionTasks {


    // Use a javaslang For-comprehension
    // // (http://static.javadoc.io/io.javaslang/javaslang/2.0.4/index.html?javaslang/API.html)
    // to retrieve the concatenated String-value from a Success<String> (Try<String>) Right<String> (Either<Integer, String>) and Some<String> (Option<String>)
    public static String concatenate(Try<String> aTry, Either<Integer, String> anEither, Option<String> anOption) {
        throw new NotImplementedException();
    }


    // Use a javaslang For-comprehension
    // (http://static.javadoc.io/io.javaslang/javaslang/2.0.4/index.html?javaslang/API.html)
    // to return an iterable over all RIGHT rectangles where the sum of the sides are <= 25
    // you are given an iterator over values for each side (a,b,c) in the triangle
    // use the things.Triangle helper class to create a new Triangle object
    // remember to put pythagoras in there somewhere
    // (c is always the hypotenus)
    public static Iterable<Triangle> combinations(Iterable<Double> a, Iterable<Double> b, Iterable<Double> c) {
        throw new NotImplementedException();
    }


}
