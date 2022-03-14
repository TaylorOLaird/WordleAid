class Node implements Comparable<Node> {
    private int info;

    Node(int info) {
        this.info = info;
    }

    public int getInfo() {
        return this.info;
    }

    public String toString() {
        return "info: " + this.info;
    }

    public int compareTo(Node rhs) {
        return rhs.count - this.count;
    }
}
