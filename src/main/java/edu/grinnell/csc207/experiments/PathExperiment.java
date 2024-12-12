package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.util.Graph;

import java.io.PrintWriter;

/**
 * A quick experiment with paths.
 *
 * @author Your Name Here
 * @author Your Name Here
 * @author Samuel A. Rebelsky
 */
public class PathExperiment {

  /**
   * Run the experiment.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    Graph g = new Graph();

    g.addVertex("a");
    g.addVertex("b");
    g.addVertex("c");
    g.addVertex("d");
    g.addVertex("e");
    g.addVertex("f");
    g.addVertex("g");

    g.addEdge("a", "b", 5);
    g.addEdge("b", "c", 2);
    g.addEdge("c", "d", 4);
    g.addEdge("d", "e", 1);
    g.addEdge("e", "g", 3);
    g.addEdge("e", "a", 7);
    g.addEdge("c", "g", 2);
    g.addEdge("g", "e", 1);

    // pen.println(g.path("a", "b"));
    // pen.println(g.path("a", "c"));
    // pen.println(g.path("a", "d"));
    // pen.println(g.path("a", "e"));
    // pen.println(g.path("a", "f"));
    // pen.println(g.path("a", "g"));
    // pen.println(g.path("a", "a"));

    pen.println(g.shortestPath(0, 6));
    pen.println(g.shortestPath(1, 6));
    pen.println(g.shortestPath(3, 6));
    pen.println(g.shortestPath(0, 0));
    pen.println(g.shortestPath(0, 5));
    pen.println(g.shortestPath(0, 3));
    pen.println("Done");


  } // main(String[])

} // PathExperiment
