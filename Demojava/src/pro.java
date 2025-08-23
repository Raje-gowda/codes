import java.util.*;
import java.util.stream.Collectors;

public class pro {


        private static final Set<String> STOP_WORDS = new HashSet<>(Arrays.asList(
                "the", "and", "with", "this", "that", "from", "there", "about", "which", "their", "would"
        ));

        private static final Set<String> POSITIVE_WORDS = new HashSet<>(Arrays.asList(
                "great", "excellent", "amazing"
        ));

        private static final Set<String> NEGATIVE_WORDS = new HashSet<>(Arrays.asList(
                "bad", "poor", "terrible"
        ));

        public static void main(String[] args) {

            List<String> feedbacks = Arrays.asList(
                    "The product quality is great and the delivery was amazing",
                    "Customer service was terrible and response time was poor",
                    "The item arrived on time with proper packaging",
                    "Excellent build quality, great value for money",
                    "Bad experience with the seller but product was okay"
            );

            // HashMap to store sentiment -> list of keywords
            Map<String, List<String>> sentimentMap = new HashMap<>();
            sentimentMap.put("Positive", new ArrayList<>());
            sentimentMap.put("Negative", new ArrayList<>());
            sentimentMap.put("Neutral", new ArrayList<>());

            // Process feedbacks
            for (String feedback : feedbacks) {
                String sentiment = getSentiment(feedback.toLowerCase());
                List<String> keywords = extractKeywords(feedback.toLowerCase());
                sentimentMap.get(sentiment).addAll(keywords);
            }

//             Display sentiment-wise keywords and top 3 frequent words
            for (String sentiment : sentimentMap.keySet()) {
                System.out.println("\nSentiment: " + sentiment);
                List<String> keywords = sentimentMap.get(sentiment);

                if (keywords.isEmpty()) {
                    System.out.println("No keywords found.");
                    continue;
                }

                Map<String, Long> frequencyMap = keywords.stream()
                        .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

                // Sort by frequency in descending order
                List<Map.Entry<String, Long>> sortedList = frequencyMap.entrySet().stream()
                        .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                        .collect(Collectors.toList());

                System.out.println("Top 3 keywords:");
                sortedList.stream().limit(3).forEach(e ->
                        System.out.println(e.getKey() + " -> " + e.getValue())
                );
            }
        }

        // Method to determine sentiment
        private static String getSentiment(String feedback) {
            for (String pos : POSITIVE_WORDS) {
                if (feedback.contains(pos)) {
                    return "Positive";
                }
            }
            for (String neg : NEGATIVE_WORDS) {
                if (feedback.contains(neg)) {
                    return "Negative";
                }
            }
            return "Neutral";
        }

        // Method to extract keywords
        private static List<String> extractKeywords(String feedback) {
            String[] words = feedback.split("\\W+");
            List<String> keywords = new ArrayList<>();
            for (String word : words) {
                if (word.length() > 4 && !STOP_WORDS.contains(word)) {
                    keywords.add(word);

                }
            }
            return keywords;
        }
    }




