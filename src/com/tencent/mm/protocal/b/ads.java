package com.tencent.mm.protocal.b;

import a.a.a.b;
import java.util.LinkedList;

public final class ads
  extends com.tencent.mm.at.a
{
  public aly iXb;
  public aly jAr;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (iXb == null) {
        throw new b("Not all required fields were included: ChatRoomName");
      }
      if (jAr == null) {
        throw new b("Not all required fields were included: ChatRoomTopic");
      }
      if (iXb != null)
      {
        paramVarArgs.cj(1, iXb.kn());
        iXb.a(paramVarArgs);
      }
      if (jAr != null)
      {
        paramVarArgs.cj(2, jAr.kn());
        jAr.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (iXb == null) {
        break label486;
      }
    }
    label486:
    for (paramInt = a.a.a.a.ch(1, iXb.kn()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (jAr != null) {
        i = paramInt + a.a.a.a.ch(2, jAr.kn());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new a.a.a.a.a((byte[])paramVarArgs[0], iTR);
        for (paramInt = com.tencent.mm.at.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.at.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.bog();
          }
        }
        if (iXb == null) {
          throw new b("Not all required fields were included: ChatRoomName");
        }
        if (jAr != null) {
          break;
        }
        throw new b("Not all required fields were included: ChatRoomTopic");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
        ads localads = (ads)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((a.a.a.a.a)localObject1).sJ(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aly();
            localObject2 = new a.a.a.a.a((byte[])localObject2, iTR);
            for (bool = true; bool; bool = ((aly)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.at.a)localObject1, com.tencent.mm.at.a.a((a.a.a.a.a)localObject2))) {}
            iXb = ((aly)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((a.a.a.a.a)localObject1).sJ(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aly();
          localObject2 = new a.a.a.a.a((byte[])localObject2, iTR);
          for (bool = true; bool; bool = ((aly)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.at.a)localObject1, com.tencent.mm.at.a.a((a.a.a.a.a)localObject2))) {}
          jAr = ((aly)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.ads
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */