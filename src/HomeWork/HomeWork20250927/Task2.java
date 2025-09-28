package HomeWork.HomeWork20250927;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 斗地主。请用JAVA编写程序实现效果
// 一副扑克牌，共54张牌，其中52张是普通牌，2张是大小王
// 步骤一：准备牌
// 步骤二：洗牌
// 步骤三：发牌
// 步骤四：给牌进行排序，方便看牌

public class Task2 {

    // 定义牌的顺序，用于排序
    private static final Map<String, Integer> CARD_ORDER = new HashMap<>();
    static {
        String[] ranks = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        int value = 0;
        for (String rank : ranks) {
            CARD_ORDER.put(rank, value++);
        }
        CARD_ORDER.put("小王", value++);
        CARD_ORDER.put("大王", value);
    }

    public static void main(String[] args) {
        // 1. 准备一副新牌
        List<String> deck = prepareCards();
        System.out.println("【准备好了牌】");

        // 2. 洗牌
        shuffleCards(deck);
        System.out.println("【洗牌完毕】");

        // 3. 准备玩家和底牌的集合
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> landlordCards = new ArrayList<>();

        // 4. 发牌
        dealCards(deck, player1, player2, player3, landlordCards);
        System.out.println("【发牌完毕】");

        // 5. 排序
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        sortCards(landlordCards);
        System.out.println("【排序完毕】");

        // 6. 看牌
        showCards("玩家1", player1);
        showCards("玩家2", player2);
        showCards("玩家3", player3);
        showCards("底牌", landlordCards);
    }

    /**
     * 准备一副54张的扑克牌
     * 
     */
    public static List<String> prepareCards() {
        List<String> deck = new ArrayList<>();
        String[] suits = { "♠", "♥", "♣", "♦" };
        String[] numbers = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };

        for (String suit : suits) {
            for (String number : numbers) {
                deck.add(suit + number);
            }
        }

        deck.add("大王");
        deck.add("小王");

        return deck;
    }

    /**
     * 对牌组进行洗牌
     * 
     */
    public static void shuffleCards(List<String> deck) {
        Collections.shuffle(deck);
    }

    /**
     * 将牌发给三位玩家，并留下三张底牌
     * 
     */
    public static void dealCards(List<String> deck, List<String> player1, List<String> player2, List<String> player3,
            List<String> landlordCards) {
        // 遍历牌堆，发前51张牌
        for (int i = 0; i < deck.size() - 3; i++) {
            String card = deck.get(i);
            if (i % 3 == 0) {
                player1.add(card);
            } else if (i % 3 == 1) {
                player2.add(card);
            } else {
                player3.add(card);
            }
        }

        // 剩下的三张作为底牌
        for (int i = deck.size() - 3; i < deck.size(); i++) {
            landlordCards.add(deck.get(i));
        }
    }

    /**
     * 对手牌进行排序
     * 
     */
    public static void sortCards(List<String> cards) {
        Collections.sort(cards, new Comparator<String>() {
            @Override
            public int compare(String card1, String card2) {
                return CARD_ORDER.get(getRank(card2)) - CARD_ORDER.get(getRank(card1));
            }
        });
    }

    private static String getRank(String card) {
        if (card.equals("大王") || card.equals("小王")) {
            return card;
        }
        return card.substring(1);
    }

    /**
     * 显示指定玩家的牌
     * 
     */
    public static void showCards(String playerName, List<String> cards) {
        System.out.println(playerName + "的牌是: " + cards);
    }
}