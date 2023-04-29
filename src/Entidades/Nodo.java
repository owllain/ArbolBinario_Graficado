package Entidades;

public class Nodo {

    private char value;
    private Nodo left;
    private Nodo right;

    public Nodo(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

    public Nodo findPredecessor() {
        if (this.getRight() == null) {
            return this;
        } else {
            return this.getRight().findPredecessor();
        }
    }

    public Nodo findSuccessor() {
        if (this.getLeft() == null) {
            return this;
        } else {
            return this.getLeft().findSuccessor();
        }
    }

    public Nodo delete(char value) {
        Nodo response = this;

        if (response.getValue() == value) {
            response = null;
        }
        
        if (value < this.value) {
            this.left = this.left.delete(value);
        } else if (value > this.value) {
            this.right = this.right.delete(value);
        } else {
            if (this.left != null && this.right != null) {
                Nodo temp = this;
                Nodo maxOfTheLeft = this.left.findPredecessor();
                this.value = maxOfTheLeft.getValue();
                temp.left = temp.left.delete(maxOfTheLeft.getValue());
            } else if (this.left != null) {
                response = this.left;
            } else if (this.right != null) {
                response = this.right;
            } else {
                response = null;
            }
        }
        return response;
    }

}
