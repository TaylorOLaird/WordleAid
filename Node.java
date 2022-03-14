class Node implements Comparable<Node> {
    private char letter;
    private int count;

    Node(char letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    public char getLetter() {
        return this.letter;
    }

    public int getCount() {
        return this.count;
    }

    public String toString() {
        return this.letter + ": " + this.count;
    }

    public int compareTo(Node rhs) {
        return rhs.count - this.count;
    }
}
