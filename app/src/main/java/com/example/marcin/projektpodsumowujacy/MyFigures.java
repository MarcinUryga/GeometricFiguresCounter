package com.example.marcin.projektpodsumowujacy;

import com.example.marcin.projektpodsumowujacy.InterfacesAndAbstractClasses.FigureRepresentatnionOnList;

/**
 * Created by MARCIN on 2017-07-15.
 */

public final class MyFigures {

    public static final class CircleFigure
            implements FigureRepresentatnionOnList {
        private int id = R.id.circleID;
        private int name = R.string.pole_kola;
        private int image = R.drawable.circle;

        @Override
        public int getFigureId() {
            return id;
        }

        @Override
        public int getImageId() {
            return image;
        }

        @Override
        public int getTextViewId() {
            return name;
        }
    }

    public static final class DiamondFigure
            implements FigureRepresentatnionOnList {
        private int id = R.id.diamondID;
        private int name = R.string.pole_rombu;
        private int image = R.drawable.diamond;

        @Override
        public int getFigureId() {
            return id;
        }

        @Override
        public int getImageId() {
            return image;
        }

        @Override
        public int getTextViewId() {
            return name;
        }
    }

    public static final class EquilateralTriangleFigure
            implements FigureRepresentatnionOnList {
        private int id = R.id.equilateraltriangleID;
        private int name = R.string.pole_trojkata_rownobocznego;
        private int image = R.drawable.equilateraltriangle;

        @Override
        public int getFigureId() {
            return id;
        }

        @Override
        public int getImageId() {
            return image;
        }

        @Override
        public int getTextViewId() {
            return name;
        }
    }

    public static final class RectangleFigure
            implements FigureRepresentatnionOnList {
        private int id = R.id.rectangleID;
        private int name = R.string.pole_prostokata;
        private int image = R.drawable.rectangle;

        @Override
        public int getFigureId() {
            return id;
        }

        @Override
        public int getImageId() {
            return image;
        }

        @Override
        public int getTextViewId() {
            return name;
        }
    }

    public static final class RectangularTriangleFigure
            implements FigureRepresentatnionOnList {
        private int id = R.id.rectangulartriangleID;
        private int name = R.string.pole_trojkata_prostokatneo;
        private int image = R.drawable.rectangulartriangle;

        @Override
        public int getFigureId() {
            return id;
        }

        @Override
        public int getImageId() {
            return image;
        }

        @Override
        public int getTextViewId() {
            return name;
        }
    }

    public static final class SquareFigure
            implements FigureRepresentatnionOnList {
        private int id = R.id.squareID;
        private int name = R.string.pole_kwadratu;
        private int image = R.drawable.square;

        @Override
        public int getFigureId() {
            return id;
        }

        @Override
        public int getImageId() {
            return image;
        }

        @Override
        public int getTextViewId() {
            return name;
        }
    }

}
