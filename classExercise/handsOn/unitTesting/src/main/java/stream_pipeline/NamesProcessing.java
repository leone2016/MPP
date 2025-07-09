package stream_pipeline;

import java.util.List;
import java.util.function.Function;

public class NamesProcessing {

    static Function<List<String>, List<String>> toMyUpperCase = names -> names.stream()
            .map(String::toUpperCase)
            .distinct()
            .toList();

//    public static List<String> getUpperCaseNames(List<String> names) {
    // TODO: revisar este código
//        Function<List<String>, List<String>> toUpperCaseAndDistinct = n -> n.stream()
//                  .map(String::toUpperCase)
//                  .distinct()
//                  .toList();
//
//        Function<List<String>, List<String>> teswt =  names.stream()
//                .map(String::toUpperCase)
//                .distinct()
//                .toList();
//        return
//    }
}
