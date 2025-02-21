package calculator;

import java.util.*;

public class Calculator {
    private List<Integer> numbers = new LinkedList<>();

    public void enter(int i) {
        numbers.add(i);
        if (numbers.size() > 2) {
            throw new IllegalStateException();
        }
    }

    public void add() {
        doOperation(Operation.ADD);
    }

    private void doOperation(Operation operation) {
        if (numbers.size() != 2) {
            throw new IllegalStateException();
        }

        numbers.set(0,
                operation == Operation.ADD ?
                        numbers.get(0) + numbers.get(1) : operation == Operation.MULTIPLY ? numbers.get(0) * numbers.get(1) : numbers.get(0)
        );
        numbers.remove(1);
    }

    public void mul() {
        doOperation(Operation.MULTIPLY);
    }

    public int getResult() {
        if (numbers.size() != 1) {
            throw new IllegalStateException();
        }
        return numbers.get(0);
    }

    private enum Operation {
        ADD,
        MULTIPLY
    }
}
