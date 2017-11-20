package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
       /* Processor processor = new Processor();
        Executor codeToexecute = () -> System.out.println("This is an exapmle text");
        processor.execute(codeToexecute); */

      /*  System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("flower",(text -> "ABC" + text + "ABC"));
        poemBeautifier.beautify("evening", (text -> text.toUpperCase()));
        poemBeautifier.beautify("connect", (text -> text.replace("n", "r")));
        poemBeautifier.beautify("I'm learning Java",(text -> text.toLowerCase().replace(" ", "_")));

    }
}
