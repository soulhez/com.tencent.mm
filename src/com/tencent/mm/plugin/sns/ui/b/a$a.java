package com.tencent.mm.plugin.sns.ui.b;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.sns.ui.aq;
import com.tencent.mm.plugin.sns.ui.ba;
import com.tencent.mm.pluginsdk.ui.d.i;
import com.tencent.mm.pluginsdk.ui.d.j;

final class a$a
  extends j
{
  a$a(a parama) {}
  
  public final void onClick(View paramView)
  {
    hDV.gZP.hrm.hCx.onClick(paramView);
  }
  
  public final void updateDrawState(TextPaint paramTextPaint)
  {
    int i = hDV.jO.getResources().getColor(2131689956);
    if (jnm)
    {
      bgColor = i;
      return;
    }
    bgColor = 0;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */