package com.iplProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {
    private static final int MATCH_ID = 0;
    private static final int MATCH_SEASON = 1;
    private static final int MATCH_CITY = 2;
    private static final int MATCH_DATE = 3;
    private static final int MATCH_TEAM_1 = 4;
    private static final int MATCH_TEAM_2 = 5;
    private static final int MATCH_TOSS_WINNER = 6;
    private static final int MATCH_TOSS_DECISION = 7;
    private static final int MATCH_RESULT = 8;
    private static final int MATCH_DL_APPLIED = 9;
    private static final int MATCH_WINNER = 10;
    private static final int MATCH_WON_BY_RUNS = 11;
    private static final int MATCH_WON_BY_WICKETS = 12;
    private static final int MATCH_PLAYER_OF_MATCH = 13;
    private static final int MATCH_VENUE = 14;
    private static final int MATCH_UMPIRE_1 = 15;
    private static final int MATCH_UMPIRE_2 = 16;
    private static final int MATCH_UMPIRE_3 = 17;
    private static final int DELIVERIES_MATCH_ID = 0;
    private static final int DELIVERIES_INNINGS = 1;
    private static final int DELIVERIES_BATTING_TEAM = 2;
    private static final int DELIVERIES_BOWLING_TEAM = 3;
    private static final int DELIVERIES_OVER = 4;
    private static final int DELIVERIES_BALL = 5;
    private static final int DELIVERIES_BATSMAN_NAME = 6;
    private static final int DELIVERIES_NON_STRIKER = 7;
    private static final int DELIVERIES_BOWLER_NAME = 8;
    private static final int DELIVERIES_SUPER_OVER = 9;
    private static final int DELIVERIES_WIDE_RUN = 10;
    private static final int DELIVERIES_BYE_RUN = 11;
    private static final int DELIVERIS_LEG_BYE_RUN = 12;
    private static final int DELIVERIES_NO_BALL_RUN = 13;
    private static final int DELIVERIES_PENALTY_RUN = 14;
    private static final int DELIVERIES_BATSMAN_RUN = 15;
    private static final int DELIVERIES_EXTRA_RUN = 16;
    private static final int DELIVERIES_TOTAL_RUN = 17;

    public static void main(String[] args) {
        List<Match> matches = retrieveMatchesData();
        List<Delivery> deliveries = retrieveDeliveriesData();

        printTotalNumberOfMatchesPlayed(matches);
        printNumberOfMatchesWonPerTeam(matches);
        printExtraRunsConcededPerTeam(matches, deliveries);
        printEconomicalBowler(matches, deliveries);
        printNumberOfMatchesPlayedInEachCity(matches);
    }

    private static List<Match> retrieveMatchesData() {
        List<Match> matchData = new ArrayList<Match>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/matches.csv"))) {
            String str = br.readLine();
            while ((str = br.readLine()) != null) {
                String[] fields = str.split(",");

                Match match = new Match();
                match.setMatchId(Integer.parseInt(fields[MATCH_ID]));
                match.setSeason(Integer.parseInt(fields[MATCH_SEASON]));
                match.setCity(fields[MATCH_CITY]);
                match.setDate(fields[MATCH_DATE]);
                match.setTeam1(fields[MATCH_TEAM_1]);
                match.setTeam2(fields[MATCH_TEAM_2]);
                match.setTossWinner(fields[MATCH_TOSS_WINNER]);
                match.setTossDecision(fields[MATCH_TOSS_DECISION]);
                match.setResult(fields[MATCH_RESULT]);
                match.setDlApplied(Integer.parseInt(fields[MATCH_DL_APPLIED]));
                match.setWinner(fields[MATCH_WINNER]);
                match.setWinByRuns(Integer.parseInt(fields[MATCH_WON_BY_RUNS]));
                match.setWinByWickets(Integer.parseInt(fields[MATCH_WON_BY_WICKETS]));
                match.setPlayerOfMatch(fields[MATCH_PLAYER_OF_MATCH]);
                match.setVenue(fields[MATCH_VENUE]);
                if (fields.length > 15)
                    match.setUmpire1(fields[MATCH_UMPIRE_1]);
                if (fields.length > 16)
                    match.setUmpire2(fields[MATCH_UMPIRE_2]);
                if (fields.length > 17)
                    match.setUmpire3(fields[MATCH_UMPIRE_3]);

                matchData.add(match);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return matchData;
    }

    private static List<Delivery> retrieveDeliveriesData() {
        List<Delivery> deliveryData = new ArrayList<Delivery>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/deliveries.csv"))) {
            String str = br.readLine();
            while ((str = br.readLine()) != null) {
                String[] fields = str.split(",");

                Delivery deliveries = new Delivery();
                deliveries.setMatchId(Integer.parseInt(fields[DELIVERIES_MATCH_ID]));
                deliveries.setInnings(Integer.parseInt(fields[DELIVERIES_INNINGS]));
                deliveries.setBattingTeam(fields[DELIVERIES_BATTING_TEAM]);
                deliveries.setBowlingTeam(fields[DELIVERIES_BOWLING_TEAM]);
                deliveries.setOver(Integer.parseInt(fields[DELIVERIES_OVER]));
                deliveries.setBall(Integer.parseInt(fields[DELIVERIES_BALL]));
                deliveries.setBatsmanName(fields[DELIVERIES_BATSMAN_NAME]);
                deliveries.setNonStriker(fields[DELIVERIES_NON_STRIKER]);
                deliveries.setBowler(fields[DELIVERIES_BOWLER_NAME]);
                deliveries.setIsSuperOver(Integer.parseInt(fields[DELIVERIES_SUPER_OVER]));
                deliveries.setWideRuns(Integer.parseInt(fields[DELIVERIES_WIDE_RUN]));
                deliveries.setByeRuns(Integer.parseInt(fields[DELIVERIES_BYE_RUN]));
                deliveries.setLegByeRuns(Integer.parseInt(fields[DELIVERIS_LEG_BYE_RUN]));
                deliveries.setNoballRuns(Integer.parseInt(fields[DELIVERIES_NO_BALL_RUN]));
                deliveries.setPenaltyRuns(Integer.parseInt(fields[DELIVERIES_PENALTY_RUN]));
                deliveries.setBatsmanRuns(Integer.parseInt(fields[DELIVERIES_BATSMAN_RUN]));
                deliveries.setExtraRuns(Integer.parseInt(fields[DELIVERIES_EXTRA_RUN]));
                deliveries.setTotalRuns(Integer.parseInt(fields[DELIVERIES_TOTAL_RUN]));
                if (fields.length > 18)
                    deliveries.setPlayerDismissed(fields[18]);
                if (fields.length > 19)
                    deliveries.setDismissalKind(fields[19]);
                if (fields.length > 20)
                    deliveries.setFielder(fields[20]);

                deliveryData.add(deliveries);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deliveryData;
    }

    private static void printTotalNumberOfMatchesPlayed(List<Match> matches) {
        Map<Integer, Integer> matchesPlayedPerYearMap = new LinkedHashMap<Integer, Integer>();

        System.out.println("Task - 1");
        System.out.println("Finding Number of matches played per year of all the years in IPL");
        for (Match match : matches) {
            int yearsOfMatch = match.getSeason();
            if (matchesPlayedPerYearMap.containsKey(yearsOfMatch)) {
                matchesPlayedPerYearMap.put(yearsOfMatch, matchesPlayedPerYearMap.get(yearsOfMatch) + 1);
            } else matchesPlayedPerYearMap.put(yearsOfMatch, 1);
        }
        System.out.println("Solution:");
        matchesPlayedPerYearMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();
    }

    private static void printNumberOfMatchesWonPerTeam(List<Match> matches) {
        Map<String, Integer> matchesWonPerTeamMap = new LinkedHashMap<String, Integer>();

        System.out.println("Task - 2");
        System.out.println("Finding Number of matches won of all teams over all the years of IPL");
        for (Match match : matches) {
            String winner = match.getWinner();
            if (matchesWonPerTeamMap.containsKey(winner)) {
                if (!winner.isEmpty())
                    matchesWonPerTeamMap.put(winner, matchesWonPerTeamMap.get(winner) + 1);
            } else matchesWonPerTeamMap.put(winner, 1);
        }
        System.out.println("Solution:");
        matchesWonPerTeamMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();
    }

    private static void printExtraRunsConcededPerTeam(List<Match> matches, List<Delivery> deliveries) {
        Map<String, Integer> runsConcededMap = new HashMap<String, Integer>();

        System.out.println("Task - 3");
        System.out.println("Finding extra runs conceded per team, for the year 2016");
        for (Match matchObj : matches) {
            if (matchObj.getSeason() == 2016) {
                for (Delivery deliveriesObj : deliveries) {
                    if (deliveriesObj.getMatchId() == matchObj.getMatchId()) {
                        if (runsConcededMap.containsKey(deliveriesObj.getBattingTeam())) {
                            runsConcededMap.put(deliveriesObj.getBattingTeam(), runsConcededMap.get(deliveriesObj.getBattingTeam()) + deliveriesObj.getExtraRuns());
                        } else runsConcededMap.put(deliveriesObj.getBattingTeam(), deliveriesObj.getExtraRuns());
                    }
                }
            }

        }
        System.out.println("Solution:");
        runsConcededMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();
    }

    private static void printEconomicalBowler(List<Match> matches, List<Delivery> deliveries) {
        Map<String, Integer> runsMap = new HashMap<String, Integer>();
        Map<String, Double> oversMap = new HashMap<String, Double>();
        Map<String, Double> economyOfBowlerMap = new LinkedHashMap<String, Double>();

        System.out.println("Task - 4");
        System.out.println("Finding the top economical bowlers for the year 2015");

        for (Match match : matches) {
            if (match.getSeason() == 2015) {
                for (Delivery deliveriesObj : deliveries) {
                    if (deliveriesObj.getMatchId() == match.getMatchId()) {
                        if (runsMap.containsKey(deliveriesObj.getBowler())) {
                            runsMap.put(deliveriesObj.getBowler(), runsMap.get(deliveriesObj.getBowler()) + deliveriesObj.getTotalRuns());
                        } else runsMap.put(deliveriesObj.getBowler(), deliveriesObj.getTotalRuns());
                    }
                }
            }
        }

        for (Match match : matches) {
            if (match.getSeason() == 2015) {
                for (Delivery deliveriesObj : deliveries) {
                    if (deliveriesObj.getMatchId() == match.getMatchId()) {
                        if (oversMap.containsKey(deliveriesObj.getBowler())) {
                            oversMap.put(deliveriesObj.getBowler(), oversMap.get(deliveriesObj.getBowler()) + 1.0);
                        } else oversMap.put(deliveriesObj.getBowler(), 1.0);
                    }
                }
            }
        }

        String[] bowler = oversMap.keySet().toArray(new String[0]);
        for (String s : bowler) {
            if (oversMap.containsKey(s)) {
                double runs = oversMap.get(s);
                oversMap.put(s, (runs / 6));
            }
        }
        for (String s : bowler) {
            double economyRate = runsMap.get(s) / oversMap.get(s);
            economyOfBowlerMap.put(s, economyRate);
        }
        System.out.println("Solution:");
        economyOfBowlerMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();
    }

    private static void printNumberOfMatchesPlayedInEachCity(List<Match> matches) {
        Map<String, Integer> matchesPlayedPerYearMap = new HashMap<String, Integer>();

        System.out.println("Custom task :");
        System.out.println("Finding Number of matches played in each city");
        Iterator<Match> matchPlayedIterator = matches.iterator();
        while (matchPlayedIterator.hasNext()) {
            String cityOfMatch = matchPlayedIterator.next().getCity();
            if (matchesPlayedPerYearMap.containsKey(cityOfMatch)) {
                matchesPlayedPerYearMap.put(cityOfMatch, matchesPlayedPerYearMap.get(cityOfMatch) + 1);
            } else matchesPlayedPerYearMap.put(cityOfMatch, 1);
        }
        System.out.println("Solution:");
        matchesPlayedPerYearMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println();
    }
}
