package chessGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChessMain {
    private static Map<String, AbstractElement> ChessBlaskPiece = new HashMap<>();
    private static Map<String, AbstractElement> ChessWhitePiece = new HashMap<>();
    private static AbstractElement selectedElement;

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Ot otL = new Ot(2, 1, "qora", "otL");
        ChessBlaskPiece.put(otL.getName(), otL);

        Ot otR = new Ot(7, 1, "qora", "otR");
        ChessBlaskPiece.put(otR.getName(), otR);

        Tora toraL = new Tora(1, 1, "qora", "toraL");
        ChessBlaskPiece.put(toraL.getName(), toraL);

        Tora toraR = new Tora(8, 1, "qora", "toraR");
        ChessBlaskPiece.put(toraR.getName(), toraR);

        Ferzi ferzi = new Ferzi(4, 1, "ferzi", "qora");
        ChessBlaskPiece.put(ferzi.getName(), ferzi);

        Fill fillL = new Fill(3, 1, "fillL", "qora");
        ChessBlaskPiece.put(fillL.getName(), fillL);

        Fill fillR = new Fill(6, 1, "fillR", "qora");
        ChessBlaskPiece.put(fillR.getName(), fillR);

        Shox shox = new Shox(5, 1, "shox", "qora");
        ChessBlaskPiece.put(shox.getName(), shox);

        Peshka peshka1 = new Peshka(1, 2, "peshka1", "qora");
        ChessBlaskPiece.put(peshka1.getName(), peshka1);

        Peshka peshka2 = new Peshka(2, 2, "peshka2", "qora");
        ChessBlaskPiece.put(peshka2.getName(), peshka2);

        Peshka peshka3 = new Peshka(3, 2, "peshka3", "qora");
        ChessBlaskPiece.put(peshka3.getName(), peshka3);

        Peshka peshka4 = new Peshka(4, 2, "peshka4", "qora");
        ChessBlaskPiece.put(peshka4.getName(), peshka4);

        Peshka peshka5 = new Peshka(5, 2, "peshka5", "qora");
        ChessBlaskPiece.put(peshka5.getName(), peshka5);

        Peshka peshka6 = new Peshka(6, 2, "peshka6", "qora");
        ChessBlaskPiece.put(peshka6.getName(), peshka6);

        Peshka peshka7 = new Peshka(7, 2, "peshka7", "qora");
        ChessBlaskPiece.put(peshka7.getName(), peshka7);

        Peshka peshka8 = new Peshka(8, 2, "peshka8", "qora");
        ChessBlaskPiece.put(peshka8.getName(), peshka8);

        // oq donalar

        Ot OtL = new Ot(2, 8, "oq", "OtL");
        ChessWhitePiece.put(OtL.getName(), OtL);

        Ot OtR = new Ot(7, 8, "oq", "OtR");
        ChessWhitePiece.put(OtR.getName(), OtR);

        Tora ToraL = new Tora(1, 8, "oq", "ToraL");
        ChessWhitePiece.put(ToraL.getName(), ToraL);

        Tora ToraR = new Tora(8, 8, "oq", "ToraR");
        ChessWhitePiece.put(ToraR.getName(), ToraR);

        Ferzi Ferzi = new Ferzi(4, 8, "Ferzi", "oq");
        ChessWhitePiece.put(Ferzi.getName(), Ferzi);

        Fill FillL = new Fill(3, 8, "FillL", "oq");
        ChessWhitePiece.put(FillL.getName(), FillL);

        Fill FillR = new Fill(6, 8, "FillR", "oq");
        ChessWhitePiece.put(FillR.getName(), FillR);

        Shox Shox = new Shox(5, 8, "Shox", "oq");
        ChessWhitePiece.put(Shox.getName(), Shox);

        Peshka Peshka1 = new Peshka(1, 7, "Peshka1", "oq");
        ChessWhitePiece.put(Peshka1.getName(), Peshka1);

        Peshka Peshka2 = new Peshka(2, 7, "Peshka2", "oq");
        ChessWhitePiece.put(Peshka2.getName(), Peshka2);

        Peshka Peshka3 = new Peshka(3, 7, "Peshka3", "oq");
        ChessWhitePiece.put(Peshka3.getName(), Peshka3);

        Peshka Peshka4 = new Peshka(4, 7, "Peshka4", "oq");
        ChessWhitePiece.put(Peshka4.getName(), Peshka4);

        Peshka Peshka5 = new Peshka(5, 7, "Peshka5", "oq");
        ChessWhitePiece.put(Peshka5.getName(), Peshka5);

        Peshka Peshka6 = new Peshka(6, 7, "Peshka6", "oq");
        ChessWhitePiece.put(Peshka6.getName(), Peshka6);

        Peshka Peshka7 = new Peshka(7, 7, "Peshka7", "oq");
        ChessWhitePiece.put(Peshka7.getName(), Peshka7);

        Peshka Peshka8 = new Peshka(8, 7, "Peshka8", "oq");
        ChessWhitePiece.put(Peshka8.getName(), Peshka8);

        printElements();

        while (true) {

            selectFigure();
            moveFigure(selectedElement);
        }
    }

    public static void printElements() {
        int a = 0;
        for (AbstractElement element : ChessBlaskPiece.values()) {
            System.out.println(a + ") " + element.getColor() + " " + element.getName() + ": " + element.xPosition + " "
                    + element.yPosition);
            a++;
        }

        for (AbstractElement element : ChessWhitePiece.values()) {
            System.out.println(a + ") " + element.getColor() + " " + element.getName() + ": " + element.xPosition
                    + " " + element.yPosition);
            a++;
        }
    }

    public static void selectFigure() {

        System.out.print("\nchoose a figure to walk: ");
        int figura = scanner.nextInt();

        if (figura < ChessBlaskPiece.size()) // kiritadigan sonimiz chessBlackPiece ni uzunligidan kichik bolsa shu
                                             // ichidan qidirsin aksxolda ChessWhitePiece
            selectedElement = ChessBlaskPiece.get(ChessBlaskPiece.keySet().toArray()[figura]);
        else
            selectedElement = ChessWhitePiece.get(ChessWhitePiece.keySet().toArray()[figura - ChessBlaskPiece.size()]);

        System.out.println("Selected figure is: " + selectedElement.getColor() + " " + selectedElement.getName() + " "
                + selectedElement.xPosition + " "
                + selectedElement.yPosition);
    }

    public static void moveFigure(AbstractElement selectedElement) {
        System.out.print("\nEnter the coordinates to walk: "); // Yurish koordinatalarini kiritish
        int xKoordinata = scanner.nextInt();
        int yKoordinata = scanner.nextInt();

        if (CheckMovePositionFree(selectedElement, xKoordinata, yKoordinata) == true) {
            selectedElement.MovePositionPiece(xKoordinata, yKoordinata);
            // selectedElement.xPosition = xKoordinata;
            // selectedElement.yPosition = yKoordinata;
            xKoordinata = selectedElement.xPosition;
            yKoordinata = selectedElement.yPosition;

            System.out.println("Figure is: " + selectedElement.getColor() + " " +
                    selectedElement.getName() +
                    " moved to: " + selectedElement.xPosition +
                    ", " + selectedElement.yPosition);
        }
    }

    public static boolean CheckMovePositionFree(AbstractElement selectedElement, int x2, int y2) {
        int xStart = selectedElement.xPosition;
        int yStart = selectedElement.yPosition;
        int xKoordinata = x2;
        int yKoordinata = y2;

        int xStep;
        if (x2 > xStart) {
            xStep = 1;
        } else if (x2 == xStart) {
            xStep = 0;
        } else {
            xStep = -1;
        }

        int yStep;
        if (y2 > yStart) {
            yStep = 1;
        } else if (y2 == yStart) {
            yStep = 0;
        } else {
            yStep = -1;
        }

        for (int x = xStart + xStep, y = yStart + yStep; x <= xKoordinata || y <= yKoordinata; x += xStep, y += yStep) {
            for (AbstractElement element : ChessBlaskPiece.values()) {
                if (x == element.xPosition && y == element.yPosition) {
                    System.out.println("Position already occupied ");
                    return false;
                }
            }
            for (AbstractElement element : ChessWhitePiece.values()) {
                if (x == element.xPosition && y == element.yPosition) {
                    System.out.println("Position already occupied ");
                    return false;
                }
            }
            return true;
        }

        return true;
    }

}
