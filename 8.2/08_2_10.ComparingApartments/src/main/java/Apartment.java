
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return getSquares() > compared.getSquares();
    }

    public int priceDifference(Apartment compared) {
        if (getPricePerSquare() < compared.getPricePerSquare()) {
            return compared.getPricePerSquare() * compared.getSquares() - getPricePerSquare() * getSquares();
        }
        return getPricePerSquare() * getSquares() - compared.getPricePerSquare() * compared.getSquares();
    }
    public boolean moreExpensiveThan(Apartment compared) {
        return getPricePerSquare() > compared.getPricePerSquare();
    }


}
