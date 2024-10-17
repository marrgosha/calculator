package fi.margokomarova.calculator._main;

import static fi.margokomarova.calculator.service.ResultWriterService.printResult;
import static fi.margokomarova.calculator.util.Calculator.*;

public class _Main {
    public static void main(String[] args) {
        int res = addNumbers(3, 5);
        printResult(3, 5, res, "summa");
        int otv = subNumbers(3, 5);
        printResult(3, 5, otv, "raznitsa");
        int otvet = multNumbers(3, 5);
        printResult(3, 5, otvet, "proizvedenie");
    }
}
