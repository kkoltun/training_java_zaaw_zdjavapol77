package com.sda.basketball;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasketballTeam {
  private Set<Player> players = new HashSet<>();

  public void addPlayer(Player player) {
    players.add(player);
  }

  public Set<Player> getPlayers() {
    return players;
  }

  public Optional<Player> getHigherThan200() {
    for (Player player : players) {
      if (player.getHeight() > 200) {
        return Optional.of(player);
      }
    }

    return Optional.empty();
  }

  public Set<Player> getHigherThan180ForLoop() {
    Predicate<Player> higherThan180 = new HigherThan180();
    Set<Player> passed = new HashSet<>();

    for (Player player : players) {
      if (higherThan180.test(player)) {
        passed.add(player);
      }
    }

    return passed;
  }

  public Set<Player> getHigherThan180SeparatePredicateClass() {
    Predicate<Player> higherThan180 = new HigherThan180();
    Set<Player> passed = new HashSet<>();

    passed = players.stream().filter(higherThan180).collect(Collectors.toSet());

    return passed;
  }

  public Set<Player> getHigherThan180() {
    // Najprostsza lambda
    Predicate<Player> higherThan180 = (Player player) -> {
      return player.getHeight() > 180;
    };

    // Krótsza wersja
    Predicate<Player> higherThan180Short = player -> player.getHeight() > 180;

    Set<Player> passed = new HashSet<>();
    passed = players.stream().filter(higherThan180).collect(Collectors.toSet());
    return passed;
  }

  public Set<Player> getHigherThan180Final() {
    return players.stream()
        .filter(player -> player.getHeight() > 180)
        .collect(Collectors.toSet());
  }

  // Demo
  public Set<String> getPlayerNames() {
    return players.stream()
        .filter(player -> player.getHeight() > 180)
        .map(player -> player.getFirstName())
        .collect(Collectors.toSet());
  }
}
