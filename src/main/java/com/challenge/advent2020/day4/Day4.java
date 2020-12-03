package com.challenge.advent2020.day4;

import com.challenge.advent2020.Day;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day4 implements Day {
   private static final Logger       logger = LoggerFactory.getLogger(Day4.class);
   private              List<String> inputData;

   public Day4(String filePath) {
      try {
         inputData = Files.readAllLines(Paths.get(filePath));
      }
      catch (IOException ex) {
         logger.error("Could not access the file {}", filePath);
         ex.printStackTrace();
      }
   }

   public List<String> solve() {
      List<String> result = new ArrayList<>();

      result.add(partA());
      result.add(partB());

      return result;
   }
}