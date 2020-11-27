package app.don.practice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;

public class ClickGroup extends ConstraintHelper {

    ConstraintLayout container;

    public ClickGroup(Context context) {
        super(context);
    }

    public ClickGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void updatePostLayout(ConstraintLayout container) {
        LayoutParams params = (LayoutParams) this.getLayoutParams();
        params.height = 100;
        params.width = 100;
        this.container = container;
        for (int i = 0; i < this.mCount; i++) {
            View child = container.getViewById(this.mIds[i]);
            if (child != null) {
                child.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ClickGroup.this.callOnClick();
                    }
                });
            }
        }
    }
}
