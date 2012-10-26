package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelRapidash extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Body_2;
    ModelRenderer Neck_2;
    ModelRenderer Neck_3;
    ModelRenderer Neck_4;
    ModelRenderer Neck_5;
    ModelRenderer ShoulderMiddle;
    ModelRenderer Cheekbones1;
    ModelRenderer Snout1;
    ModelRenderer LeftEar;
    ModelRenderer RightEar;
    ModelRenderer Horn;
    ModelRenderer LeftEye1;
    ModelRenderer RightEye1;
    ModelRenderer SmoothBack1;
    ModelRenderer Withers1;
    ModelRenderer Mane1;
    ModelRenderer Mane2;
    ModelRenderer Mane3;
    ModelRenderer Mane4;
    ModelRenderer Mane5;
    ModelRenderer Mane6;
    ModelRenderer Mane7;
    ModelRenderer Mane8;
    ModelRenderer Mane9;
    ModelRenderer Mane10;
    ModelRenderer Mane11;
    ModelRenderer Mane12;
    ModelRenderer Mane13;
    ModelRenderer Mane14;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Mane15;
    ModelRenderer Tail5;
    ModelRenderer Tail6;
    ModelRenderer Tail7;
    ModelRenderer Tail8;
    ModelRenderer Mane17;
    ModelRenderer Tail9;
    ModelRenderer Tail10;
    ModelRenderer Tail11;
    ModelRenderer Hindquarters3;
    ModelRenderer Hindquarters4;
    ModelRenderer Mane18;
    ModelRenderer Mane19;
    ModelRenderer Mane20;
    ModelRenderer Mane21;
    ModelRenderer Mane22;
    ModelRenderer Mane23;
    ModelRenderer Mane24;
    ModelRenderer Mane25;
    ModelRenderer Mane26;
    ModelRenderer Mane27;
    ModelRenderer Mane28;
    ModelRenderer Mane29;
    ModelRenderer Mane30;
    ModelRenderer Mane31;
    ModelRenderer Mane32;
    ModelRenderer Mane33;
    ModelRenderer Mane34;
    ModelRenderer Mane35;
    ModelRenderer Mane36;
    ModelRenderer Mane37;
    ModelRenderer Mane38;
    ModelRenderer Mane39;
    ModelRenderer Mane40;
    ModelRenderer Mane41;
    ModelRenderer Mane42;
    ModelRenderer Mane43;
    ModelRenderer Mane44;
    ModelRenderer Mane45;
    ModelRenderer Mane46;
    ModelRenderer FlameBL1;
    ModelRenderer FlameBL2;
    ModelRenderer FlameBL4;
    ModelRenderer FlameBL3;
    ModelRenderer Shape63;
    ModelRenderer ShoulderFL;
    ModelRenderer LegFL1;
    ModelRenderer LegFL2;
    ModelRenderer FootFL;
    ModelRenderer HoofFL;
    ModelRenderer HoofBaseFL;
    ModelRenderer FlameFL1;
    ModelRenderer FlameFL2;
    ModelRenderer FlameFL3;
    ModelRenderer FlameFL4;
    ModelRenderer FlameFL5;
    ModelRenderer ShoulderFR;
    ModelRenderer LegFR1;
    ModelRenderer LegFR2;
    ModelRenderer FootFR1;
    ModelRenderer HoofFR1;
    ModelRenderer HoofBaseFR1;
    ModelRenderer FlameFR1;
    ModelRenderer FlameFR2;
    ModelRenderer FlameFR3;
    ModelRenderer FlameFR4;
    ModelRenderer FlameFR5;
    ModelRenderer HindquartersBR;
    ModelRenderer BackLegBR1;
    ModelRenderer BackLegBR2;
    ModelRenderer FootBR;
    ModelRenderer HoofBR;
    ModelRenderer HoofBaseBR;
    ModelRenderer FlameBR1;
    ModelRenderer FlameBR2;
    ModelRenderer FlameBR3;
    ModelRenderer FlameBR4;
    ModelRenderer HindquartersBL;
    ModelRenderer BackLegBL1;
    ModelRenderer BackLegBL2;
    ModelRenderer FootBL;
    ModelRenderer HoofBL;
    ModelRenderer HoofBaseBL;
    ModelRenderer LegFL;
    ModelRenderer LegFR;
    ModelRenderer LegBR;
    ModelRenderer LegBL;
  
  public ModelRapidash()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 6, 6, 17);
      Body.setRotationPoint(-3.2F, 6.6F, -8.866667F);
      Body.setTextureSize(128, 64);
      Body.mirror = true;
      setRotation(Body, 0.0371786F, 0F, 0F);
      Body_2 = new ModelRenderer(this, 46, 16);
      Body_2.addBox(0F, 0F, 0F, 6, 2, 6);
      Body_2.setRotationPoint(-3.2F, 5.6666667F, -5.333333F);
      Body_2.setTextureSize(128, 64);
      Body_2.mirror = true;
      setRotation(Body_2, 0.0371786F, 0F, 0F);
      Neck_2 = new ModelRenderer(this, 46, 0);
      Neck_2.addBox(0F, 0F, 0F, 2, 12, 4);
      Neck_2.setRotationPoint(-1.066667F, -0.4F, -12.33333F);
      Neck_2.setTextureSize(128, 64);
      Neck_2.mirror = true;
      setRotation(Neck_2, 0.5576792F, 0F, 0F);
      Neck_3 = new ModelRenderer(this, 58, 0);
      Neck_3.addBox(0F, 0F, 0F, 4, 12, 3);
      Neck_3.setRotationPoint(-2.066667F, -0.666667F, -11.8F);
      Neck_3.setTextureSize(128, 64);
      Neck_3.mirror = true;
      setRotation(Neck_3, 0.7807508F, 0F, 0F);
      Neck_4 = new ModelRenderer(this, 72, 0);
      Neck_4.addBox(0F, 0F, 0F, 3, 11, 4);
      Neck_4.setRotationPoint(-1.566667F, -0.5F, -12.6F);
      Neck_4.setTextureSize(128, 64);
      Neck_4.mirror = true;
      setRotation(Neck_4, 0.7435722F, 0F, 0F);
      Neck_5 = new ModelRenderer(this, 86, 0);
      Neck_5.addBox(0F, 0F, 0F, 2, 9, 3);
      Neck_5.setRotationPoint(-1.066667F, 3F, -10F);
      Neck_5.setTextureSize(128, 64);
      Neck_5.mirror = true;
      setRotation(Neck_5, 0.3717861F, 0F, 0F);
      ShoulderMiddle = new ModelRenderer(this, 18, 24);
      ShoulderMiddle.addBox(0F, 0F, 0F, 8, 4, 4);
      ShoulderMiddle.setRotationPoint(-4.2F, 7.466667F, -6.933333F);
      ShoulderMiddle.setTextureSize(128, 64);
      ShoulderMiddle.mirror = true;
      setRotation(ShoulderMiddle, 0.1487144F, 0F, 0F);
      Cheekbones1 = new ModelRenderer(this, 70, 16);
      Cheekbones1.addBox(0F, 0F, 0F, 5, 4, 4);
      Cheekbones1.setRotationPoint(-2.666667F, -2.733333F, -13.53333F);
      Cheekbones1.setTextureSize(128, 64);
      Cheekbones1.mirror = true;
      setRotation(Cheekbones1, 0.3346075F, 0F, 0F);
      Snout1 = new ModelRenderer(this, 98, 16);
      Snout1.addBox(0F, 0F, 0F, 3, 3, 7);
      Snout1.setRotationPoint(-1.666667F, -0.4F, -17.13333F);
      Snout1.setTextureSize(128, 64);
      Snout1.mirror = true;
      setRotation(Snout1, 0.5948578F, 0F, 0F);
      LeftEar = new ModelRenderer(this, 88, 13);
      LeftEar.addBox(0F, 0F, 0F, 1, 1, 2);
      LeftEar.setRotationPoint(1.2F, -3.266666F, -10.53333F);
      LeftEar.setTextureSize(128, 64);
      LeftEar.mirror = true;
      setRotation(LeftEar, 1.933288F, 0F, 0F);
      RightEar = new ModelRenderer(this, 88, 13);
      RightEar.addBox(0F, 0F, 0F, 1, 1, 2);
      RightEar.setRotationPoint(-2.533333F, -3.3F, -10.5F);
      RightEar.setTextureSize(128, 64);
      RightEar.mirror = true;
      setRotation(RightEar, 1.933284F, 0F, 0F);
      Horn = new ModelRenderer(this, 97, 11);
      Horn.addBox(0F, 0F, 0F, 1, 1, 4);
      Horn.setRotationPoint(-0.7F, -2.066667F, -12.6F);
      Horn.setTextureSize(128, 64);
      Horn.mirror = true;
      setRotation(Horn, 2.305074F, 0F, 0F);
      LeftEye1 = new ModelRenderer(this, 118, 16);
      LeftEye1.addBox(0F, 0F, 0F, 0, 1, 1);
      LeftEye1.setRotationPoint(1.5F, -1.2F, -13.4F);
      LeftEye1.setTextureSize(128, 64);
      LeftEye1.mirror = true;
      setRotation(LeftEye1, 2.007652F, 0.5215393F, 0F);
      RightEye1 = new ModelRenderer(this, 118, 16);
      RightEye1.addBox(0F, 0F, 0F, 0, 1, 1);
      RightEye1.setRotationPoint(-1.8F, -1.2F, -13.43333F);
      RightEye1.setTextureSize(128, 64);
      RightEye1.mirror = true;
      setRotation(RightEye1, 2.007653F, -0.5204991F, 0F);
      SmoothBack1 = new ModelRenderer(this, 42, 30);
      SmoothBack1.addBox(0F, 0F, 0F, 5, 1, 1);
      SmoothBack1.setRotationPoint(-2.7F, 6.733333F, 0.1333333F);
      SmoothBack1.setTextureSize(128, 64);
      SmoothBack1.mirror = true;
      setRotation(SmoothBack1, 1.041001F, 0F, 0F);
      Withers1 = new ModelRenderer(this, 42, 28);
      Withers1.addBox(0F, 0F, 0F, 4, 1, 1);
      Withers1.setRotationPoint(-2.1F, 5.9333333F, -2.266667F);
      Withers1.setTextureSize(128, 64);
      Withers1.mirror = true;
      setRotation(Withers1, 1.152537F, 0F, 0F);
      Mane1 = new ModelRenderer(this, 114, 53);
      Mane1.addBox(0F, 0F, 0F, 0, 4, 7);
      Mane1.setRotationPoint(-0.3333333F, 4.6666667F, 0.4F);
      Mane1.setTextureSize(128, 64);
      Mane1.mirror = true;
      setRotation(Mane1, 0.2974289F, 0F, 0F);
      Mane2 = new ModelRenderer(this, 102, 54);
      Mane2.addBox(0F, 0F, 0F, 0, 4, 6);
      Mane2.setRotationPoint(-0.3F, 5.5333334F, -1.6F);
      Mane2.setTextureSize(128, 64);
      Mane2.mirror = true;
      setRotation(Mane2, 0.7063936F, 0F, 0F);
      Mane3 = new ModelRenderer(this, 90, 56);
      Mane3.addBox(0F, 0F, 0F, 0, 2, 6);
      Mane3.setRotationPoint(-0.3F, 4.7333333F, 1.333333F);
      Mane3.setTextureSize(128, 64);
      Mane3.mirror = true;
      setRotation(Mane3, 0.8551081F, 0F, 0F);
      Mane4 = new ModelRenderer(this, 78, 57);
      Mane4.addBox(0F, 0F, 0F, 0, 1, 6);
      Mane4.setRotationPoint(-0.3F, 4.8666667F, 3.266667F);
      Mane4.setTextureSize(128, 64);
      Mane4.mirror = true;
      setRotation(Mane4, 0.9666439F, 0F, 0F);
      Mane5 = new ModelRenderer(this, 78, 57);
      Mane5.addBox(0F, 0F, 0F, 0, 1, 6);
      Mane5.setRotationPoint(-0.3F, 5.8F, 0F);
      Mane5.setTextureSize(128, 64);
      Mane5.mirror = true;
      setRotation(Mane5, 0.8551081F, 0F, 0F);
      Mane6 = new ModelRenderer(this, 78, 57);
      Mane6.addBox(0F, 0F, 0F, 0, 1, 6);
      Mane6.setRotationPoint(-0.3F, 3.866667F, 3.666667F);
      Mane6.setTextureSize(128, 64);
      Mane6.mirror = true;
      setRotation(Mane6, 0.7807508F, 0F, 0F);
      Mane7 = new ModelRenderer(this, 114, 53);
      Mane7.addBox(0F, 0F, 0F, 0, 4, 7);
      Mane7.setRotationPoint(-0.3F, 5.6F, -3.866667F);
      Mane7.setTextureSize(128, 64);
      Mane7.mirror = true;
      setRotation(Mane7, 0.7063936F, 0F, 0F);
      Mane8 = new ModelRenderer(this, 102, 54);
      Mane8.addBox(0F, 0F, 0F, 0, 4, 6);
      Mane8.setRotationPoint(-0.3F, 5.5333334F, -4.666667F);
      Mane8.setTextureSize(128, 64);
      Mane8.mirror = true;
      setRotation(Mane8, 2.67686F, 0F, 0F);
      Mane9 = new ModelRenderer(this, 102, 54);
      Mane9.addBox(0F, 0F, 0F, 0, 4, 6);
      Mane9.setRotationPoint(-0.3F, 8.533333F, -2.133333F);
      Mane9.setTextureSize(128, 64);
      Mane9.mirror = true;
      setRotation(Mane9, 1.933288F, 0F, 0F);
      Mane10 = new ModelRenderer(this, 102, 54);
      Mane10.addBox(0F, 0F, 0F, 0, 4, 6);
      Mane10.setRotationPoint(-0.3F, 6.8F, -7.2F);
      Mane10.setTextureSize(128, 64);
      Mane10.mirror = true;
      setRotation(Mane10, 1.710216F, 0F, 0F);
      Mane11 = new ModelRenderer(this, 100, 54);
      Mane11.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane11.setRotationPoint(-0.3F, 0.5F, 7.5F);
      Mane11.setTextureSize(128, 64);
      Mane11.mirror = true;
      setRotation(Mane11, 0.9666439F, 0F, 0F);
      Mane12 = new ModelRenderer(this, 96, 53);
      Mane12.addBox(0F, 0F, 0F, 0, 1, 2);
      Mane12.setRotationPoint(-0.3F, 5F, 6.8F);
      Mane12.setTextureSize(128, 64);
      Mane12.mirror = true;
      setRotation(Mane12, 1.412787F, 0F, 0F);
      Mane13 = new ModelRenderer(this, 96, 53);
      Mane13.addBox(0F, 0F, 0F, 0, 1, 2);
      Mane13.setRotationPoint(-0.3F, 5F, 6.666667F);
      Mane13.setTextureSize(128, 64);
      Mane13.mirror = true;
      setRotation(Mane13, 1.115358F, 0F, 0F);
      Mane14 = new ModelRenderer(this, 96, 53);
      Mane14.addBox(0F, 0F, 0F, 0, 1, 2);
      Mane14.setRotationPoint(-0.3F, 4.9F, 6.166667F);
      Mane14.setTextureSize(128, 64);
      Mane14.mirror = true;
      setRotation(Mane14, 0.5205006F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 94, 51);
      Tail1.addBox(0F, 0F, 0F, 0, 4, 1);
      Tail1.setRotationPoint(-0.3F, 7.8F, 8.8F);
      Tail1.setTextureSize(128, 64);
      Tail1.mirror = true;
      setRotation(Tail1, 2.305074F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 92, 53);
      Tail2.addBox(0F, 0F, 0F, 0, 2, 1);
      Tail2.setRotationPoint(-0.3F, 7.266667F, 9.733334F);
      Tail2.setTextureSize(128, 64);
      Tail2.mirror = true;
      setRotation(Tail2, 2.639681F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 90, 49);
      Tail3.addBox(0F, 0F, 0F, 0, 6, 1);
      Tail3.setRotationPoint(-0.3F, 7.333333F, 9.6F);
      Tail3.setTextureSize(128, 64);
      Tail3.mirror = true;
      setRotation(Tail3, 2.044824F, 0F, 0F);
      Tail4 = new ModelRenderer(this, 90, 44);
      Tail4.addBox(0F, 0F, 0F, 0, 3, 2);
      Tail4.setRotationPoint(-0.3F, 6.866667F, 10.53333F);
      Tail4.setTextureSize(128, 64);
      Tail4.mirror = true;
      setRotation(Tail4, 1.003822F, 0F, 0F);
      Mane15 = new ModelRenderer(this, 96, 53);
      Mane15.addBox(0F, 0F, 0F, 0, 1, 2);
      Mane15.setRotationPoint(-0.3F, 2.466667F, 5.4F);
      Mane15.setTextureSize(128, 64);
      Mane15.mirror = true;
      setRotation(Mane15, 0.7807508F, 0F, 0F);
      Tail5 = new ModelRenderer(this, 94, 44);
      Tail5.addBox(0F, 0F, 0F, 0, 5, 2);
      Tail5.setRotationPoint(-0.3F, 6.733333F, 11.46667F);
      Tail5.setTextureSize(128, 64);
      Tail5.mirror = true;
      setRotation(Tail5, 1.115358F, 0F, 0F);
      Tail6 = new ModelRenderer(this, 94, 44);
      Tail6.addBox(0F, 0F, 0F, 0, 5, 2);
      Tail6.setRotationPoint(-0.3F, 5.1F, 13F);
      Tail6.setTextureSize(128, 64);
      Tail6.mirror = true;
      setRotation(Tail6, 0.715585F, 0F, 0F);
      Tail7 = new ModelRenderer(this, 94, 44);
      Tail7.addBox(0F, 0F, 0F, 0, 5, 2);
      Tail7.setRotationPoint(-0.3F, 6.8F, 12.4F);
      Tail7.setTextureSize(128, 64);
      Tail7.mirror = true;
      setRotation(Tail7, 0.5576792F, 0F, 0F);
      Tail8 = new ModelRenderer(this, 96, 53);
      Tail8.addBox(0F, 0F, 0F, 0, 1, 2);
      Tail8.setRotationPoint(-0.3F, 5F, 11.06667F);
      Tail8.setTextureSize(128, 64);
      Tail8.mirror = true;
      setRotation(Tail8, 0.5576792F, 0F, 0F);
      Mane17 = new ModelRenderer(this, 102, 54);
      Mane17.addBox(0F, 0F, 0F, 0, 4, 6);
      Mane17.setRotationPoint(-0.3F, 5F, -8.2F);
      Mane17.setTextureSize(128, 64);
      Mane17.mirror = true;
      setRotation(Mane17, 1.710216F, 0F, 0F);
      Tail9 = new ModelRenderer(this, 106, 45);
      Tail9.addBox(0F, 0F, 0F, 0, 5, 4);
      Tail9.setRotationPoint(-0.3F, 5F, 13F);
      Tail9.setTextureSize(128, 64);
      Tail9.mirror = true;
      setRotation(Tail9, 0.3066203F, 0F, 0F);
      Tail10 = new ModelRenderer(this, 106, 45);
      Tail10.addBox(0F, 0F, 0F, 0, 5, 4);
      Tail10.setRotationPoint(-0.3F, 7.533333F, 15.2F);
      Tail10.setTextureSize(128, 64);
      Tail10.mirror = true;
      setRotation(Tail10, 1.161728F, 0F, 0F);
      Tail11 = new ModelRenderer(this, 114, 43);
      Tail11.addBox(0F, 0F, 0F, 0, 6, 4);
      Tail11.setRotationPoint(-0.3F, 9.6F, 14.73333F);
      Tail11.setTextureSize(128, 64);
      Tail11.mirror = true;
      setRotation(Tail11, 0.5296919F, 0F, 0F);
      Hindquarters3 = new ModelRenderer(this, 0, 39);
      Hindquarters3.addBox(0F, 0F, 0F, 5, 1, 4);
      Hindquarters3.setRotationPoint(-2.7F, 6.266667F, 4.4F);
      Hindquarters3.setTextureSize(128, 64);
      Hindquarters3.mirror = true;
      setRotation(Hindquarters3, 0.2602503F, 0F, 0F);
      Hindquarters4 = new ModelRenderer(this, 0, 46);
      Hindquarters4.addBox(0F, 0F, 0F, 5, 2, 6);
      Hindquarters4.setRotationPoint(-2.7F, 5.1F, 8.2F);
      Hindquarters4.setTextureSize(128, 64);
      Hindquarters4.mirror = true;
      setRotation(Hindquarters4, -0.837758F, 0F, 0F);
      Mane18 = new ModelRenderer(this, 78, 49);
      Mane18.addBox(0F, 0F, 0F, 0, 2, 6);
      Mane18.setRotationPoint(-0.3F, -1.533333F, -14.26667F);
      Mane18.setTextureSize(128, 64);
      Mane18.mirror = true;
      setRotation(Mane18, 1.041001F, 0F, 0F);
      Mane19 = new ModelRenderer(this, 78, 57);
      Mane19.addBox(0F, 0F, 0F, 0, 1, 6);
      Mane19.setRotationPoint(-0.3F, -2.333333F, -12.4F);
      Mane19.setTextureSize(128, 64);
      Mane19.mirror = true;
      setRotation(Mane19, 0.8551081F, 0F, 0F);
      Mane20 = new ModelRenderer(this, 100, 54);
      Mane20.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane20.setRotationPoint(-0.3F, -6F, -10.06667F);
      Mane20.setTextureSize(128, 64);
      Mane20.mirror = true;
      setRotation(Mane20, 0.669215F, 0F, 0F);
      Mane21 = new ModelRenderer(this, 100, 54);
      Mane21.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane21.setRotationPoint(-0.3F, -5.4F, -10.9F);
      Mane21.setTextureSize(128, 64);
      Mane21.mirror = true;
      setRotation(Mane21, 0.8551081F, 0F, 0F);
      Mane22 = new ModelRenderer(this, 100, 54);
      Mane22.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane22.setRotationPoint(-0.3F, -3.266666F, -12.4F);
      Mane22.setTextureSize(128, 64);
      Mane22.mirror = true;
      setRotation(Mane22, 1.449966F, 0F, 0F);
      Mane23 = new ModelRenderer(this, 80, 43);
      Mane23.addBox(0F, 0F, 0F, 0, 1, 5);
      Mane23.setRotationPoint(-0.3F, -4.266666F, -11.33333F);
      Mane23.setTextureSize(128, 64);
      Mane23.mirror = true;
      setRotation(Mane23, 0.6320364F, 0F, 0F);
      Mane24 = new ModelRenderer(this, 100, 54);
      Mane24.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane24.setRotationPoint(-0.3F, -5.9F, -7.733333F);
      Mane24.setTextureSize(128, 64);
      Mane24.mirror = true;
      setRotation(Mane24, 1.375609F, 0F, 0F);
      Mane25 = new ModelRenderer(this, 78, 49);
      Mane25.addBox(0F, 0F, 0F, 0, 2, 6);
      Mane25.setRotationPoint(-0.3F, 0.866667F, -10.06667F);
      Mane25.setTextureSize(128, 64);
      Mane25.mirror = true;
      setRotation(Mane25, 1.544048F, 0F, 0F);
      Mane26 = new ModelRenderer(this, 68, 57);
      Mane26.addBox(0F, 0F, 0F, 0, 2, 5);
      Mane26.setRotationPoint(-0.3F, -4.666667F, -10.33333F);
      Mane26.setTextureSize(128, 64);
      Mane26.mirror = true;
      setRotation(Mane26, 0.0743572F, 0F, 0F);
      Mane27 = new ModelRenderer(this, 100, 54);
      Mane27.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane27.setRotationPoint(-0.3F, -4.2F, -8.5F);
      Mane27.setTextureSize(128, 64);
      Mane27.mirror = true;
      setRotation(Mane27, 1.673038F, 0F, 0F);
      Mane28 = new ModelRenderer(this, 70, 51);
      Mane28.addBox(0F, 0F, 0F, 0, 2, 4);
      Mane28.setRotationPoint(-0.3F, -4.733334F, -7.733333F);
      Mane28.setTextureSize(128, 64);
      Mane28.mirror = true;
      setRotation(Mane28, 0.5948578F, 0F, 0F);
      Mane29 = new ModelRenderer(this, 68, 57);
      Mane29.addBox(0F, 0F, 0F, 0, 2, 5);
      Mane29.setRotationPoint(-0.3F, -3.866667F, -9.133333F);
      Mane29.setTextureSize(128, 64);
      Mane29.mirror = true;
      setRotation(Mane29, 0.2230717F, 0F, 0F);
      Mane30 = new ModelRenderer(this, 68, 57);
      Mane30.addBox(0F, 0F, 0F, 0, 2, 5);
      Mane30.setRotationPoint(-0.3F, -4.2F, -7.8F);
      Mane30.setTextureSize(128, 64);
      Mane30.mirror = true;
      setRotation(Mane30, -0.0743572F, 0F, 0F);
      Mane31 = new ModelRenderer(this, 68, 57);
      Mane31.addBox(0F, 0F, 0F, 0, 2, 5);
      Mane31.setRotationPoint(-0.3F, -5.13333F, -9.4F);
      Mane31.setTextureSize(128, 64);
      Mane31.mirror = true;
      setRotation(Mane31, 0.1858931F, 0F, 0F);
      Mane32 = new ModelRenderer(this, 56, 55);
      Mane32.addBox(0F, 0F, 0F, 0, 3, 6);
      Mane32.setRotationPoint(-0.3F, -6.13333F, -5.533333F);
      Mane32.setTextureSize(128, 64);
      Mane32.mirror = true;
      setRotation(Mane32, -0.1487144F, 0F, 0F);
      Mane33 = new ModelRenderer(this, 40, 52);
      Mane33.addBox(0F, 0F, 0F, 0, 4, 8);
      Mane33.setRotationPoint(-0.3F, 5.8F, 16.8F);
      Mane33.setTextureSize(128, 64);
      Mane33.mirror = true;
      setRotation(Mane33, -0.3346075F, 0F, 0F);
      Mane34 = new ModelRenderer(this, 26, 52);
      Mane34.addBox(0F, 0F, 0F, 0, 5, 7);
      Mane34.setRotationPoint(-0.3F, 8.466667F, 21.2F);
      Mane34.setTextureSize(128, 64);
      Mane34.mirror = true;
      setRotation(Mane34, -0.5948578F, 0F, 0F);
      Mane35 = new ModelRenderer(this, 90, 37);
      Mane35.addBox(0F, 0F, 0F, 0, 3, 4);
      Mane35.setRotationPoint(-0.3F, 12.2F, 23.8F);
      Mane35.setTextureSize(128, 64);
      Mane35.mirror = true;
      setRotation(Mane35, 0.2974289F, 0F, 0F);
      Mane36 = new ModelRenderer(this, 90, 32);
      Mane36.addBox(0F, 0F, 0F, 0, 2, 3);
      Mane36.setRotationPoint(-0.3F, 13.666667F, 27F);
      Mane36.setTextureSize(128, 64);
      Mane36.mirror = true;
      setRotation(Mane36, 1.673038F, 0F, 0F);
      Mane37 = new ModelRenderer(this, 100, 54);
      Mane37.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane37.setRotationPoint(-0.3F, 10.2F, 26.5F);
      Mane37.setTextureSize(128, 64);
      Mane37.mirror = true;
      setRotation(Mane37, 0.4089647F, 0F, 0F);
      Mane38 = new ModelRenderer(this, 100, 54);
      Mane38.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane38.setRotationPoint(-0.3F, 9.6F, 26.8F);
      Mane38.setTextureSize(128, 64);
      Mane38.mirror = true;
      setRotation(Mane38, 0.4089647F, 0F, 0F);
      Mane39 = new ModelRenderer(this, 74, 43);
      Mane39.addBox(0F, 0F, 0F, 0, 6, 2);
      Mane39.setRotationPoint(-0.3F, -2.533333F, -4.533333F);
      Mane39.setTextureSize(128, 64);
      Mane39.mirror = true;
      setRotation(Mane39, 0.9666439F, 0F, 0F);
      Mane40 = new ModelRenderer(this, 100, 54);
      Mane40.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane40.setRotationPoint(-0.3F, -2.2F, -7.066667F);
      Mane40.setTextureSize(128, 64);
      Mane40.mirror = true;
      setRotation(Mane40, 0.7807508F, 0F, 0F);
      Mane41 = new ModelRenderer(this, 56, 55);
      Mane41.addBox(0F, 0F, 0F, 0, 3, 6);
      Mane41.setRotationPoint(-0.3F, -3.333333F, -1.133333F);
      Mane41.setTextureSize(128, 64);
      Mane41.mirror = true;
      setRotation(Mane41, 0F, 0F, 0F);
      Mane42 = new ModelRenderer(this, 78, 49);
      Mane42.addBox(0F, 0F, 0F, 0, 2, 6);
      Mane42.setRotationPoint(-0.3F, -2.8F, -1.466667F);
      Mane42.setTextureSize(128, 64);
      Mane42.mirror = true;
      setRotation(Mane42, 0.3346075F, 0F, 0F);
      Mane43 = new ModelRenderer(this, 68, 57);
      Mane43.addBox(0F, 0F, 0F, 0, 2, 5);
      Mane43.setRotationPoint(-0.3F, -2.933333F, 1.666667F);
      Mane43.setTextureSize(128, 64);
      Mane43.mirror = true;
      setRotation(Mane43, 0.6320364F, 0F, 0F);
      Mane44 = new ModelRenderer(this, 84, 39);
      Mane44.addBox(0F, 0F, 0F, 0, 1, 3);
      Mane44.setRotationPoint(-0.3F, -4.4F, 4.466667F);
      Mane44.setTextureSize(128, 64);
      Mane44.mirror = true;
      setRotation(Mane44, 0.9294653F, 0F, 0F);
      Mane45 = new ModelRenderer(this, 100, 54);
      Mane45.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane45.setRotationPoint(-0.3F, -6.46667F, 6.333333F);
      Mane45.setTextureSize(128, 64);
      Mane45.mirror = true;
      setRotation(Mane45, 0.8551081F, 0F, 0F);
      Mane46 = new ModelRenderer(this, 100, 54);
      Mane46.addBox(0F, 0F, 0F, 0, 1, 1);
      Mane46.setRotationPoint(-0.3F, -2.2F, -5.2F);
      Mane46.setTextureSize(128, 64);
      Mane46.mirror = true;
      setRotation(Mane46, 0.9666439F, 0F, 0F);
      Shape63 = new ModelRenderer(this, 106, 45);
      Shape63.addBox(0F, 0F, 0F, 0, 5, 4);
      Shape63.setRotationPoint(-0.3F, 5F, 0F);
      Shape63.setTextureSize(128, 64);
      Shape63.mirror = true;
      setRotation(Shape63, 0.3066203F, 0F, 0F);
    LegFL = new ModelRenderer(this, "LegFL");
    LegFL.setRotationPoint(3F, 9F, -5F);
    setRotation(LegFL, 0F, 0F, 0F);
    LegFL.mirror = true;
      ShoulderFL = new ModelRenderer(this, 0, 24);
      ShoulderFL.addBox(0F, 0F, 0F, 2, 8, 7);
      ShoulderFL.setRotationPoint(-1.5F, -3F, -4.1F);
      ShoulderFL.setTextureSize(128, 64);
      ShoulderFL.mirror = true;
      setRotation(ShoulderFL, 0.1858931F, 0F, 0F);
      LegFL1 = new ModelRenderer(this, 96, 0);
      LegFL1.addBox(0F, 0F, 0F, 2, 7, 3);
      LegFL1.setRotationPoint(-1.3F, 1F, -1.9F);
      LegFL1.setTextureSize(128, 64);
      LegFL1.mirror = true;
      setRotation(LegFL1, 0.0371786F, 0F, 0.0743572F);
      LegFL2 = new ModelRenderer(this, 106, 0);
      LegFL2.addBox(0F, 0F, 0F, 1, 7, 2);
      LegFL2.setRotationPoint(-1.1F, 7.3F, -1.4F);
      LegFL2.setTextureSize(128, 64);
      LegFL2.mirror = true;
      setRotation(LegFL2, 0F, 0F, 0.0371786F);
      FootFL = new ModelRenderer(this, 112, 0);
      FootFL.addBox(0F, 0F, 0F, 1, 2, 1);
      FootFL.setRotationPoint(-1.4F, 13F, -0.9F);
      FootFL.setTextureSize(128, 64);
      FootFL.mirror = true;
      setRotation(FootFL, -0.2974216F, 0F, 0F);
      HoofFL = new ModelRenderer(this, 112, 3);
      HoofFL.addBox(0F, 0F, 0F, 1, 1, 2);
      HoofFL.setRotationPoint(-1.3F, 14.6F, -2.1F);
      HoofFL.setTextureSize(128, 64);
      HoofFL.mirror = true;
      setRotation(HoofFL, 0.1487144F, 0F, 0F);
      HoofBaseFL = new ModelRenderer(this, 112, 6);
      HoofBaseFL.addBox(0F, 0F, 0F, 2, 1, 2);
      HoofBaseFL.setRotationPoint(-1.8F, 14.6F, -2.2F);
      HoofBaseFL.setTextureSize(128, 64);
      HoofBaseFL.mirror = true;
      setRotation(HoofBaseFL, 0F, 0F, 0F);
      FlameFL1 = new ModelRenderer(this, 68, 57);
      FlameFL1.addBox(0F, 0F, 0F, 0, 2, 5);
      FlameFL1.setRotationPoint(-0.9F, 12.5F, -1.1F);
      FlameFL1.setTextureSize(128, 64);
      FlameFL1.mirror = true;
      setRotation(FlameFL1, 0.7807556F, 0F, 0F);
      FlameFL2 = new ModelRenderer(this, 100, 54);
      FlameFL2.addBox(0F, 0F, 0F, 0, 1, 1);
      FlameFL2.setRotationPoint(-0.9F, 7.7F, 3.1F);
      FlameFL2.setTextureSize(128, 64);
      FlameFL2.mirror = true;
      setRotation(FlameFL2, 1.970466F, 0F, 0F);
      FlameFL3 = new ModelRenderer(this, 100, 54);
      FlameFL3.addBox(0F, 0F, 0F, 0, 1, 1);
      FlameFL3.setRotationPoint(-0.9F, 10.9F, 3.4F);
      FlameFL3.setTextureSize(128, 64);
      FlameFL3.mirror = true;
      setRotation(FlameFL3, 1.970466F, 0F, 0F);
      FlameFL4 = new ModelRenderer(this, 84, 39);
      FlameFL4.addBox(0F, 0F, 0F, 0, 1, 3);
      FlameFL4.setRotationPoint(-0.9F, 12.7F, -0.8F);
      FlameFL4.setTextureSize(128, 64);
      FlameFL4.mirror = true;
      setRotation(FlameFL4, 0.6320364F, 0F, 0F);
      FlameFL5 = new ModelRenderer(this, 94, 44);
      FlameFL5.addBox(0F, 0F, 0F, 0, 5, 2);
      FlameFL5.setRotationPoint(-0.9F, 11.6F, 1.1F);
      FlameFL5.setTextureSize(128, 64);
      FlameFL5.mirror = true;
      setRotation(FlameFL5, 2.305067F, 0F, 0F);
	  
	      LegFL.addChild(ShoulderFL);
          LegFL.addChild(LegFL1);
          LegFL.addChild(LegFL2);
          LegFL.addChild(FootFL);
          LegFL.addChild(HoofFL);
          LegFL.addChild(HoofBaseFL);
          LegFL.addChild(FlameFL1);
          LegFL.addChild(FlameFL2);
          LegFL.addChild(FlameFL3);
          LegFL.addChild(FlameFL4);
          LegFL.addChild(FlameFL5);
	  
    LegFR = new ModelRenderer(this, "LegFR");
    LegFR.setRotationPoint(-3.5F, 9F, -5F);
    setRotation(LegFR, 0F, 0F, 0F);
    LegFR.mirror = true;
      ShoulderFR = new ModelRenderer(this, 0, 24);
      ShoulderFR.addBox(0F, 0F, 0F, 2, 8, 7);
      ShoulderFR.setRotationPoint(-0.3F, -3F, -4.1F);
      ShoulderFR.setTextureSize(128, 64);
      ShoulderFR.mirror = true;
      setRotation(ShoulderFR, 0.1858931F, 0F, 0F);
      LegFR1 = new ModelRenderer(this, 96, 0);
      LegFR1.addBox(0F, 0F, 0F, 2, 7, 3);
      LegFR1.setRotationPoint(-0.6F, 1F, -1.9F);
      LegFR1.setTextureSize(128, 64);
      LegFR1.mirror = true;
      setRotation(LegFR1, 0.0371786F, 0F, -0.0743572F);
      LegFR2 = new ModelRenderer(this, 106, 0);
      LegFR2.addBox(0F, 0F, 0F, 1, 7, 2);
      LegFR2.setRotationPoint(0.5F, 6.3F, -1.4F);
      LegFR2.setTextureSize(128, 64);
      LegFR2.mirror = true;
      setRotation(LegFR2, 0F, 0F, -0.0371786F);
      FootFR1 = new ModelRenderer(this, 112, 0);
      FootFR1.addBox(0F, 0F, 0F, 1, 2, 1);
      FootFR1.setRotationPoint(1F, 13F, -0.9F);
      FootFR1.setTextureSize(128, 64);
      FootFR1.mirror = true;
      setRotation(FootFR1, -0.2974289F, 0F, 0F);
      HoofFR1 = new ModelRenderer(this, 112, 3);
      HoofFR1.addBox(0F, 0F, 0F, 1, 1, 2);
      HoofFR1.setRotationPoint(1.2F, 14.6F, -2.2F);
      HoofFR1.setTextureSize(128, 64);
      HoofFR1.mirror = true;
      setRotation(HoofFR1, 0.1487195F, 0F, 0F);
      HoofBaseFR1 = new ModelRenderer(this, 112, 6);
      HoofBaseFR1.addBox(0F, 0F, 0F, 2, 1, 2);
      HoofBaseFR1.setRotationPoint(0.3F, 14.6F, -2.2F);
      HoofBaseFR1.setTextureSize(128, 64);
      HoofBaseFR1.mirror = true;
      setRotation(HoofBaseFR1, 0F, 0F, 0F);
      FlameFR1 = new ModelRenderer(this, 68, 57);
      FlameFR1.addBox(0F, 0F, 0F, 0, 2, 5);
      FlameFR1.setRotationPoint(1.3F, 12.5F, -1.1F);
      FlameFR1.setTextureSize(128, 64);
      FlameFR1.mirror = true;
      setRotation(FlameFR1, 0.7807508F, 0F, 0F);
      FlameFR2 = new ModelRenderer(this, 100, 54);
      FlameFR2.addBox(0F, 0F, 0F, 0, 1, 1);
      FlameFR2.setRotationPoint(1.3F, 7.7F, 3.1F);
      FlameFR2.setTextureSize(128, 64);
      FlameFR2.mirror = true;
      setRotation(FlameFR2, 1.970466F, 0F, 0F);
      FlameFR3 = new ModelRenderer(this, 100, 54);
      FlameFR3.addBox(0F, 0F, 0F, 0, 1, 1);
      FlameFR3.setRotationPoint(1.3F, 10.9F, 3.4F);
      FlameFR3.setTextureSize(128, 64);
      FlameFR3.mirror = true;
      setRotation(FlameFR3, 1.970466F, 0F, 0F);
      FlameFR4 = new ModelRenderer(this, 84, 39);
      FlameFR4.addBox(0F, 0F, 0F, 0, 1, 3);
      FlameFR4.setRotationPoint(1.3F, 12.7F, -0.8F);
      FlameFR4.setTextureSize(128, 64);
      FlameFR4.mirror = true;
      setRotation(FlameFR4, 0.6320364F, 0F, 0F);
      FlameFR5 = new ModelRenderer(this, 94, 44);
      FlameFR5.addBox(0F, 0F, 0F, 0, 5, 2);
      FlameFR5.setRotationPoint(1.3F, 11.6F, 1.1F);
      FlameFR5.setTextureSize(128, 64);
      FlameFR5.mirror = true;
      setRotation(FlameFR5, 2.305067F, 0F, 0F);
	  
	      LegFR.addChild(ShoulderFR);
          LegFR.addChild(LegFR1);
          LegFR.addChild(LegFR2);
          LegFR.addChild(FootFR1);
          LegFR.addChild(HoofFR1);
          LegFR.addChild(HoofBaseFR1);
          LegFR.addChild(FlameFR1);
          LegFR.addChild(FlameFR2);
          LegFR.addChild(FlameFR3);
          LegFR.addChild(FlameFR4);
          LegFR.addChild(FlameFR5);
	  
    LegBR = new ModelRenderer(this, "LegBR");
    LegBR.setRotationPoint(-3F, 10F, 7F);
    setRotation(LegBR, 0F, 0F, 0F);
    LegBR.mirror = true;
      HindquartersBR = new ModelRenderer(this, 18, 32);
      HindquartersBR.addBox(0F, 0F, 0F, 3, 7, 7);
      HindquartersBR.setRotationPoint(-0.7F, -4.1F, -0.6F);
      HindquartersBR.setTextureSize(128, 64);
      HindquartersBR.mirror = true;
      setRotation(HindquartersBR, -0.5576792F, 0F, 0F);
      BackLegBR1 = new ModelRenderer(this, 38, 32);
      BackLegBR1.addBox(0F, 0F, 0F, 2, 7, 4);
      BackLegBR1.setRotationPoint(-0.3F, 2F, -3F);
      BackLegBR1.setTextureSize(128, 64);
      BackLegBR1.mirror = true;
      setRotation(BackLegBR1, 0.8551066F, 0F, 0F);
      BackLegBR2 = new ModelRenderer(this, 50, 32);
      BackLegBR2.addBox(0F, 0F, 0F, 2, 10, 2);
      BackLegBR2.setRotationPoint(-0.3F, 3F, 2.3F);
      BackLegBR2.setTextureSize(128, 64);
      BackLegBR2.mirror = true;
      setRotation(BackLegBR2, 0F, 0F, 0F);
      FootBR = new ModelRenderer(this, 112, 0);
      FootBR.addBox(0F, 0F, 0F, 1, 2, 1);
      FootBR.setRotationPoint(0.2F, 11.9F, 2.3F);
      FootBR.setTextureSize(128, 64);
      FootBR.mirror = true;
      setRotation(FootBR, -0.2974289F, 0F, 0F);
      HoofBR = new ModelRenderer(this, 112, 3);
      HoofBR.addBox(0F, 0F, 0F, 1, 1, 2);
      HoofBR.setRotationPoint(0.2F, 13.2F, 1F);
      HoofBR.setTextureSize(128, 64);
      HoofBR.mirror = true;
      setRotation(HoofBR, 0.1858931F, 0F, 0F);
      HoofBaseBR = new ModelRenderer(this, 112, 6);
      HoofBaseBR.addBox(0F, 0F, 0F, 2, 1, 2);
      HoofBaseBR.setRotationPoint(-0.3F, 13.2F, 1.3F);
      HoofBaseBR.setTextureSize(128, 64);
      HoofBaseBR.mirror = true;
      setRotation(HoofBaseBR, 0F, 0F, 0F);
      FlameBR1 = new ModelRenderer(this, 68, 57);
      FlameBR1.addBox(0F, 0F, 0F, 0, 2, 5);
      FlameBR1.setRotationPoint(0.8F, 11.1F, 2.7F);
      FlameBR1.setTextureSize(128, 64);
      FlameBR1.mirror = true;
      setRotation(FlameBR1, 0.7063936F, 0F, 0F);
      FlameBR2 = new ModelRenderer(this, 90, 49);
      FlameBR2.addBox(0F, 0F, 0F, 0, 6, 1);
      FlameBR2.setRotationPoint(0.8F, 12F, 3.9F);
      FlameBR2.setTextureSize(128, 64);
      FlameBR2.mirror = true;
      setRotation(FlameBR2, 2.41661F, 0F, 0F);
      FlameBR3 = new ModelRenderer(this, 90, 56);
      FlameBR3.addBox(0F, 0F, 0F, 0, 2, 6);
      FlameBR3.setRotationPoint(0.8F, 9.8F, 3F);
      FlameBR3.setTextureSize(128, 64);
      FlameBR3.mirror = true;
      setRotation(FlameBR3, 0.9666506F, 0F, 0F);
      FlameBR4 = new ModelRenderer(this, 100, 54);
      FlameBR4.addBox(0F, 0F, 0F, 0, 1, 1);
      FlameBR4.setRotationPoint(0.8F, 5.4F, 6.3F);
      FlameBR4.setTextureSize(128, 64);
      FlameBR4.mirror = true;
      setRotation(FlameBR4, 1.970466F, 0F, 0F);
	  
	  LegBR.addChild(HindquartersBR);
	  LegBR.addChild(BackLegBR1);
	  LegBR.addChild(BackLegBR2);
	  LegBR.addChild(FootBR);
	  LegBR.addChild(HoofBR);
	  LegBR.addChild(HoofBaseBR);
	  LegBR.addChild(FlameBR1);
	  LegBR.addChild(FlameBR2);
	  LegBR.addChild(FlameBR3);
	  LegBR.addChild(FlameBR4);
	  
    LegBL = new ModelRenderer(this, "LegBL");
    LegBL.setRotationPoint(3F, 10F, 7F);
    setRotation(LegBL, 0F, 0F, 0F);
    LegBL.mirror = true;
      HindquartersBL = new ModelRenderer(this, 18, 32);
      HindquartersBL.addBox(0F, 0F, 0F, 3, 7, 7);
      HindquartersBL.setRotationPoint(-3F, -4.1F, -0.6F);
      HindquartersBL.setTextureSize(128, 64);
      HindquartersBL.mirror = true;
      setRotation(HindquartersBL, -0.5576792F, 0F, 0F);
      BackLegBL1 = new ModelRenderer(this, 38, 32);
      BackLegBL1.addBox(0F, 0F, 0F, 2, 7, 4);
      BackLegBL1.setRotationPoint(-2F, 2F, -3F);
      BackLegBL1.setTextureSize(128, 64);
      BackLegBL1.mirror = true;
      setRotation(BackLegBL1, 0.8551081F, 0F, 0F);
      BackLegBL2 = new ModelRenderer(this, 50, 32);
      BackLegBL2.addBox(0F, 0F, 0F, 2, 10, 2);
      BackLegBL2.setRotationPoint(-2F, 3F, 2.3F);
      BackLegBL2.setTextureSize(128, 64);
      BackLegBL2.mirror = true;
      setRotation(BackLegBL2, 0F, 0F, 0F);
      FootBL = new ModelRenderer(this, 112, 0);
      FootBL.addBox(0F, 0F, 0F, 1, 2, 1);
      FootBL.setRotationPoint(-1.5F, 11.9F, 2.3F);
      FootBL.setTextureSize(128, 64);
      FootBL.mirror = true;
      setRotation(FootBL, -0.2974289F, 0F, 0F);
      HoofBL = new ModelRenderer(this, 112, 3);
      HoofBL.addBox(0F, 0F, 0F, 1, 1, 2);
      HoofBL.setRotationPoint(-1.5F, 13.2F, 1F);
      HoofBL.setTextureSize(128, 64);
      HoofBL.mirror = true;
      setRotation(HoofBL, 0.1858931F, 0F, 0F);
      HoofBaseBL = new ModelRenderer(this, 112, 6);
      HoofBaseBL.addBox(0F, 0F, 0F, 2, 1, 2);
      HoofBaseBL.setRotationPoint(-2F, 13.2F, 1.3F);
      HoofBaseBL.setTextureSize(128, 64);
      HoofBaseBL.mirror = true;
      setRotation(HoofBaseBL, 0F, 0F, 0F);
      FlameBL1 = new ModelRenderer(this, 68, 57);
      FlameBL1.addBox(0F, 0F, 0F, 0, 2, 5);
      FlameBL1.setRotationPoint(-1.1F, 11.1F, 2.7F);
      FlameBL1.setTextureSize(128, 64);
      FlameBL1.mirror = true;
      setRotation(FlameBL1, 0.7063936F, 0F, 0F);
      FlameBL2 = new ModelRenderer(this, 90, 49);
      FlameBL2.addBox(0F, 0F, 0F, 0, 6, 1);
      FlameBL2.setRotationPoint(-1.1F, 12F, 3.9F);
      FlameBL2.setTextureSize(128, 64);
      FlameBL2.mirror = true;
      setRotation(FlameBL2, 2.41661F, 0F, 0F);
      FlameBL3 = new ModelRenderer(this, 90, 56);
      FlameBL3.addBox(0F, 0F, 0F, 0, 2, 6);
      FlameBL3.setRotationPoint(-1.1F, 9.8F, 3F);
      FlameBL3.setTextureSize(128, 64);
      FlameBL3.mirror = true;
      setRotation(FlameBL3, 0.9666439F, 0F, 0F);
      FlameBL4 = new ModelRenderer(this, 100, 54);
      FlameBL4.addBox(0F, 0F, 0F, 0, 1, 1);
      FlameBL4.setRotationPoint(-1.1F, 5.5F, 6.3F);
      FlameBL4.setTextureSize(128, 64);
      FlameBL4.mirror = true;
      setRotation(FlameBL4, 1.970466F, 0F, 0F);
	  
	  LegBL.addChild(HindquartersBL);
	  LegBL.addChild(BackLegBL1);
	  LegBL.addChild(BackLegBL2);
	  LegBL.addChild(FootBL);
	  LegBL.addChild(HoofBL);
	  LegBL.addChild(HoofBaseBL);
	  LegBL.addChild(FlameBL1);
	  LegBL.addChild(FlameBL2);
	  LegBL.addChild(FlameBL3);
	  LegBL.addChild(FlameBL4);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Body_2.render(f5);
    Neck_2.render(f5);
    Neck_3.render(f5);
    Neck_4.render(f5);
    Neck_5.render(f5);
    ShoulderMiddle.render(f5);
    Cheekbones1.render(f5);
    Snout1.render(f5);
    LeftEar.render(f5);
    RightEar.render(f5);
    Horn.render(f5);
    LeftEye1.render(f5);
    RightEye1.render(f5);
    SmoothBack1.render(f5);
    Withers1.render(f5);
    Mane1.render(f5);
    Mane2.render(f5);
    Mane3.render(f5);
    Mane4.render(f5);
    Mane5.render(f5);
    Mane6.render(f5);
    Mane7.render(f5);
    Mane8.render(f5);
    Mane9.render(f5);
    Mane10.render(f5);
    Mane11.render(f5);
    Mane12.render(f5);
    Mane13.render(f5);
    Mane14.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Tail4.render(f5);
    Mane15.render(f5);
    Tail5.render(f5);
    Tail6.render(f5);
    Tail7.render(f5);
    Tail8.render(f5);
    Mane17.render(f5);
    Tail9.render(f5);
    Tail10.render(f5);
    Tail11.render(f5);
    Hindquarters3.render(f5);
    Hindquarters4.render(f5);
    Mane18.render(f5);
    Mane19.render(f5);
    Mane20.render(f5);
    Mane21.render(f5);
    Mane22.render(f5);
    Mane23.render(f5);
    Mane24.render(f5);
    Mane25.render(f5);
    Mane26.render(f5);
    Mane27.render(f5);
    Mane28.render(f5);
    Mane29.render(f5);
    Mane30.render(f5);
    Mane31.render(f5);
    Mane32.render(f5);
    Mane33.render(f5);
    Mane34.render(f5);
    Mane35.render(f5);
    Mane36.render(f5);
    Mane37.render(f5);
    Mane38.render(f5);
    Mane39.render(f5);
    Mane40.render(f5);
    Mane41.render(f5);
    Mane42.render(f5);
    Mane43.render(f5);
    Mane44.render(f5);
    Mane45.render(f5);
    Mane46.render(f5);
    Shape63.render(f5);
    LegFL.render(f5);
    LegFR.render(f5);
    LegBR.render(f5);
    LegBL.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
    LegFL.rotateAngleX = MathHelper.cos(f*.5F + (float)Math.PI)*.4F*f1;
    LegFR.rotateAngleX = MathHelper.cos(f*.5F)*.4F*f1;
    LegBL.rotateAngleX = MathHelper.cos(f*.5F)*.7F*f1;
    LegBR.rotateAngleX = MathHelper.cos(f*.5F + (float)Math.PI)*.7F*f1;
  }

}
