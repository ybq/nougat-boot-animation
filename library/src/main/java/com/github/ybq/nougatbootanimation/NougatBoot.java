package com.github.ybq.nougatbootanimation;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

import com.github.ybq.android.spinkit.animation.SpriteAnimatorBuilder;
import com.github.ybq.android.spinkit.sprite.ShapeSprite;
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.sprite.SpriteContainer;

public class NougatBoot extends SpriteContainer {

    @Override
    public Sprite[] onCreateChild() {
        return new Sprite[]{
                new Circle(Color.parseColor("#DB4437"), 0, 360),
                new Circle(Color.parseColor("#F4B400"), 72, -288),
                new Circle(Color.parseColor("#4285F4"), -144, 216),
                new Circle(Color.parseColor("#0F9D58"), 216, -144)
        };
    }

    @Override
    public void setColor(int color) {
        // disable color
    }

    class Circle extends ShapeSprite {

        private int startAngle, endAngle;
        private float[] p0, p1, p2, p3, c0, c1, c2, c3, c4, c5, c6, c7;
        private Path path;
        private int strokeWidth;

        public Circle(int color, int startAngle, int endAngle) {
            setColor(color);
            this.startAngle = startAngle;
            this.endAngle = endAngle;
        }

        @Override
        protected void onBoundsChange(Rect bounds) {
            super.onBoundsChange(bounds);
            setDrawBounds(clipSquare(bounds));
            int w = getDrawBounds().width();
            int h = getDrawBounds().height();

            p0 = new float[]{0, h / 2};
            p1 = new float[]{w / 2, 0};
            p2 = new float[]{w, h / 2};
            p3 = new float[]{w / 2, h};


            c0 = new float[]{0, h * 3 / 4};
            c1 = new float[]{0, h / 9};
            c2 = new float[]{w / 4, 0};
            c3 = new float[]{w * 3 / 4, 0};
            c4 = new float[]{w, h / 9};
            c5 = new float[]{w, h * 3 / 4};
            c6 = new float[]{w * 3 / 4, h};
            c7 = new float[]{w / 8, h};

            path = new Path();
            path.moveTo(p0[0], p0[1]);
            cubicTo(path, c1, c2, p1);
            cubicTo(path, c3, c4, p2);
            cubicTo(path, c5, c6, p3);
            cubicTo(path, c7, c0, p0);
            strokeWidth = getDrawBounds().width() / 18;
        }

        @Override
        public void drawShape(Canvas canvas, Paint paint) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
            paint.setStrokeWidth(strokeWidth);
            paint.setStyle(Paint.Style.STROKE);
            canvas.translate(getDrawBounds().left, getDrawBounds().top);
            canvas.drawPath(path, paint);
        }

        private void cubicTo(Path path, float[] c0, float[] c1, float[] p) {
            path.cubicTo(
                    c0[0], c0[1],
                    c1[0], c1[1],
                    p[0], p[1]
            );
        }

        @Override
        public ValueAnimator onCreateAnimation() {
            float[] fractions = new float[]{0, 1};
            return new SpriteAnimatorBuilder(this).
                    rotate(fractions, startAngle, endAngle).
                    duration(5500).
                    build();
        }
    }
}
