package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelBeedrill extends ModelBase {
	// fields
	ModelRenderer BodyMiddle;
	ModelRenderer BodyHorizontalMiddle;
	ModelRenderer BodyVerticalMiddle;
	ModelRenderer BodyFrontMiddle;
	ModelRenderer StingerMainMiddle;
	ModelRenderer StingerHorizontalMiddle;
	ModelRenderer StingerFrontMiddle;
	ModelRenderer StingerVerticalalMiddle;
	ModelRenderer StingerPointBase;
	ModelRenderer StingerPointMiddle;
	ModelRenderer StingerPointBase1;
	ModelRenderer StingerPointBase2;
	ModelRenderer StingerPointMiddle2;
	ModelRenderer LLB1;
	ModelRenderer LLB2;
	ModelRenderer LLCMain;
	ModelRenderer LF1;
	ModelRenderer LF2;
	ModelRenderer LF3;
	ModelRenderer LF4;
	ModelRenderer RLB1;
	ModelRenderer RLB2;
	ModelRenderer RLCMain;
	ModelRenderer RF1;
	ModelRenderer RF2;
	ModelRenderer RF3;
	ModelRenderer RF4;
	ModelRenderer LWT;
	ModelRenderer RWB;
	ModelRenderer RWT;
	ModelRenderer LWB;
	ModelRenderer LAB1;
	ModelRenderer LAB2;
	ModelRenderer LA1;
	ModelRenderer LA2;
	ModelRenderer LS2;
	ModelRenderer LS1;
	ModelRenderer LS4;
	ModelRenderer LS6;
	ModelRenderer LS8;
	ModelRenderer LS10;
	ModelRenderer LS3;
	ModelRenderer LS5;
	ModelRenderer LS7;
	ModelRenderer LS9;
	ModelRenderer RAB1;
	ModelRenderer RAB2;
	ModelRenderer RA1;
	ModelRenderer RA2;
	ModelRenderer RS2;
	ModelRenderer RS1;
	ModelRenderer RS4;
	ModelRenderer RS6;
	ModelRenderer RS8;
	ModelRenderer RS10;
	ModelRenderer RS3;
	ModelRenderer RS5;
	ModelRenderer RS7;
	ModelRenderer RS9;
	ModelRenderer HeadCenter;
	ModelRenderer HeadFrontMiddle;
	ModelRenderer HeadHorizontalMiddle;
	ModelRenderer HeadVerticalMiddle;
	ModelRenderer AntennaBaseL;
	ModelRenderer AntennaEndL;
	ModelRenderer AntennaBaseR;
	ModelRenderer AntennaEndR;
	ModelRenderer RightEyeBack;
	ModelRenderer RightEyeFront;
	ModelRenderer LeftEyeBack;
	ModelRenderer LeftEyeFront;
	ModelRenderer Beedrill;
	ModelRenderer HeadBase;
	ModelRenderer StingerBase;
	ModelRenderer ArmR;
	ModelRenderer ArmL;

	public ModelBeedrill() {
		textureWidth = 512;
		textureHeight = 256;

		Beedrill = new ModelRenderer(this, "Beedrill");
		Beedrill.setRotationPoint(0F, -60F, 0F);
		setRotation(Beedrill, 0F, 0F, 0F);
		Beedrill.mirror = true;
		HeadBase = new ModelRenderer(this, "HeadBase");
		HeadBase.setRotationPoint(0F, -7F, 0F);
		setRotation(HeadBase, 0F, 0F, 0F);
		HeadBase.mirror = true;
		HeadCenter = new ModelRenderer(this, 0, 227);
		HeadCenter.addBox(-7F, -11F, -11F, 14, 10, 18);
		HeadCenter.setRotationPoint(0F, 0F, 0F);
		HeadCenter.setTextureSize(512, 256);
		HeadCenter.mirror = true;
		setRotation(HeadCenter, 0F, 0F, 0F);
		HeadFrontMiddle = new ModelRenderer(this, 0, 222);
		HeadFrontMiddle.addBox(-6F, -9F, -16F, 12, 6, 24);
		HeadFrontMiddle.setRotationPoint(0F, 0F, 0F);
		HeadFrontMiddle.setTextureSize(512, 256);
		HeadFrontMiddle.mirror = true;
		setRotation(HeadFrontMiddle, 0F, 0F, 0F);
		HeadHorizontalMiddle = new ModelRenderer(this, 0, 228);
		HeadHorizontalMiddle.addBox(-8F, -10F, -10F, 16, 8, 16);
		HeadHorizontalMiddle.setRotationPoint(0F, 0F, 0F);
		HeadHorizontalMiddle.setTextureSize(512, 256);
		HeadHorizontalMiddle.mirror = true;
		setRotation(HeadHorizontalMiddle, 0F, 0F, 0F);
		HeadVerticalMiddle = new ModelRenderer(this, 0, 227);
		HeadVerticalMiddle.addBox(-6F, -12F, -10F, 12, 12, 16);
		HeadVerticalMiddle.setRotationPoint(0F, 0F, 0F);
		HeadVerticalMiddle.setTextureSize(512, 256);
		HeadVerticalMiddle.mirror = true;
		setRotation(HeadVerticalMiddle, 0F, 0F, 0F);
		AntennaBaseL = new ModelRenderer(this, 200, 0);
		AntennaBaseL.addBox(-0.5F, -11F, 0F, 1, 11, 1);
		AntennaBaseL.setRotationPoint(-4F, -12F, -2F);
		AntennaBaseL.setTextureSize(512, 256);
		AntennaBaseL.mirror = true;
		setRotation(AntennaBaseL, -0.0872665F, 0F, 0F);
		AntennaEndL = new ModelRenderer(this, 200, 0);
		AntennaEndL.addBox(-0.5F, -1F, -12F, 1, 2, 12);
		AntennaEndL.setRotationPoint(-4F, -23F, 0F);
		AntennaEndL.setTextureSize(512, 256);
		AntennaEndL.mirror = true;
		setRotation(AntennaEndL, 0F, 0F, 0F);
		AntennaBaseR = new ModelRenderer(this, 200, 0);
		AntennaBaseR.addBox(-0.5F, -11F, 0F, 1, 11, 1);
		AntennaBaseR.setRotationPoint(4F, -12F, -2F);
		AntennaBaseR.setTextureSize(512, 256);
		AntennaBaseR.mirror = true;
		setRotation(AntennaBaseR, -0.0872665F, 0F, 0F);
		AntennaEndR = new ModelRenderer(this, 200, 0);
		AntennaEndR.addBox(-0.5F, -1F, -12F, 1, 2, 12);
		AntennaEndR.setRotationPoint(4F, -23F, 0F);
		AntennaEndR.setTextureSize(512, 256);
		AntennaEndR.mirror = true;
		setRotation(AntennaEndR, 0F, 0F, 0F);
		RightEyeBack = new ModelRenderer(this, 0, 200);
		RightEyeBack.addBox(-9F, -10F, -7F, 1, 6, 8);
		RightEyeBack.setRotationPoint(0F, 0F, 0F);
		RightEyeBack.setTextureSize(512, 256);
		RightEyeBack.mirror = true;
		setRotation(RightEyeBack, 0F, 0F, 0F);
		RightEyeFront = new ModelRenderer(this, 0, 192);
		RightEyeFront.addBox(-9F, -9F, -9F, 1, 4, 2);
		RightEyeFront.setRotationPoint(0F, 0F, 0F);
		RightEyeFront.setTextureSize(512, 256);
		RightEyeFront.mirror = true;
		setRotation(RightEyeFront, 0F, 0F, 0F);
		LeftEyeBack = new ModelRenderer(this, 0, 176);
		LeftEyeBack.addBox(8F, -10F, -7F, 1, 6, 8);
		LeftEyeBack.setRotationPoint(0F, 0F, 0F);
		LeftEyeBack.setTextureSize(512, 256);
		LeftEyeBack.mirror = true;
		setRotation(LeftEyeBack, 0F, 0F, 0F);
		LeftEyeFront = new ModelRenderer(this, 0, 167);
		LeftEyeFront.addBox(8F, -9F, -9F, 1, 4, 2);
		LeftEyeFront.setRotationPoint(0F, 0F, 0F);
		LeftEyeFront.setTextureSize(512, 256);
		LeftEyeFront.mirror = true;
		setRotation(LeftEyeFront, 0F, 0F, 0F);

		HeadBase.addChild(HeadCenter);
		HeadBase.addChild(HeadFrontMiddle);
		HeadBase.addChild(HeadHorizontalMiddle);
		HeadBase.addChild(HeadVerticalMiddle);
		HeadBase.addChild(RightEyeBack);
		HeadBase.addChild(RightEyeFront);
		HeadBase.addChild(LeftEyeBack);
		HeadBase.addChild(LeftEyeFront);
		HeadBase.addChild(AntennaBaseR);
		HeadBase.addChild(AntennaEndR);
		HeadBase.addChild(AntennaBaseL);
		HeadBase.addChild(AntennaEndL);
		Beedrill.addChild(HeadBase);

		StingerBase = new ModelRenderer(this, "StingerBase");
		StingerBase.setRotationPoint(0F, 7F, 2F);
		setRotation(StingerBase, 0F, 0F, 0F);
		StingerBase.mirror = true;
		StingerMainMiddle = new ModelRenderer(this, 76, 159);
		StingerMainMiddle.addBox(-8F, 0F, -21F, 16, 16, 22);
		StingerMainMiddle.setRotationPoint(0F, 0F, 0F);
		StingerMainMiddle.setTextureSize(512, 256);
		StingerMainMiddle.mirror = true;
		setRotation(StingerMainMiddle, 0.3665191F, 0F, 0F);
		StingerHorizontalMiddle = new ModelRenderer(this, 174, 175);
		StingerHorizontalMiddle.addBox(-9F, 2F, -18.8F, 18, 12, 18);
		StingerHorizontalMiddle.setRotationPoint(0F, 0F, 0F);
		StingerHorizontalMiddle.setTextureSize(512, 256);
		StingerHorizontalMiddle.mirror = true;
		setRotation(StingerHorizontalMiddle, 0.3665191F, 0F, 0F);
		StingerFrontMiddle = new ModelRenderer(this, 268, 167);
		StingerFrontMiddle.addBox(-6F, 2F, -22F, 12, 12, 24);
		StingerFrontMiddle.setRotationPoint(0F, 0F, 0F);
		StingerFrontMiddle.setTextureSize(512, 256);
		StingerFrontMiddle.mirror = true;
		setRotation(StingerFrontMiddle, 0.3665191F, 0F, 0F);
		StingerVerticalalMiddle = new ModelRenderer(this, 281, 120);
		StingerVerticalalMiddle.addBox(-6F, -1F, -18F, 12, 18, 18);
		StingerVerticalalMiddle.setRotationPoint(0F, 0F, 0F);
		StingerVerticalalMiddle.setTextureSize(512, 256);
		StingerVerticalalMiddle.mirror = true;
		setRotation(StingerVerticalalMiddle, 0.3665191F, 0F, 0F);
		StingerPointBase = new ModelRenderer(this, 0, 231);
		StingerPointBase.addBox(4F, 3F, -24F, 6, 6, 14);
		StingerPointBase.setRotationPoint(0F, 0F, 0F);
		StingerPointBase.setTextureSize(512, 256);
		StingerPointBase.mirror = true;
		setRotation(StingerPointBase, 0.4537856F, -0.296706F, 0.7330383F);
		StingerPointMiddle = new ModelRenderer(this, 0, 234);
		StingerPointMiddle.addBox(5F, 4F, -27F, 4, 4, 14);
		StingerPointMiddle.setRotationPoint(0F, 0F, 0F);
		StingerPointMiddle.setTextureSize(512, 256);
		StingerPointMiddle.mirror = true;
		setRotation(StingerPointMiddle, 0.4537856F, -0.296706F, 0.7330383F);
		StingerPointBase1 = new ModelRenderer(this, 0, 230);
		StingerPointBase1.addBox(6F, 5F, -30F, 2, 2, 14);
		StingerPointBase1.setRotationPoint(0F, 0F, 0F);
		StingerPointBase1.setTextureSize(512, 256);
		StingerPointBase1.mirror = true;
		setRotation(StingerPointBase1, 0.4537856F, -0.296706F, 0.7330383F);
		StingerPointBase2 = new ModelRenderer(this, 0, 231);
		StingerPointBase2.addBox(4.5F, 3.5F, -25.5F, 5, 5, 14);
		StingerPointBase2.setRotationPoint(0F, 0F, 0F);
		StingerPointBase2.setTextureSize(512, 256);
		StingerPointBase2.mirror = true;
		setRotation(StingerPointBase2, 0.4537856F, -0.296706F, 0.7330383F);
		StingerPointMiddle2 = new ModelRenderer(this, 0, 234);
		StingerPointMiddle2.addBox(5.5F, 4.5F, -28.5F, 3, 3, 14);
		StingerPointMiddle2.setRotationPoint(0F, 0F, 0F);
		StingerPointMiddle2.setTextureSize(512, 256);
		StingerPointMiddle2.mirror = true;
		setRotation(StingerPointMiddle2, 0.4537856F, -0.296706F, 0.7330383F);

		StingerBase.addChild(StingerMainMiddle);
		StingerBase.addChild(StingerHorizontalMiddle);
		StingerBase.addChild(StingerFrontMiddle);
		StingerBase.addChild(StingerVerticalalMiddle);
		StingerBase.addChild(StingerPointBase);
		StingerBase.addChild(StingerPointBase1);
		StingerBase.addChild(StingerPointBase2);
		StingerBase.addChild(StingerPointMiddle);
		StingerBase.addChild(StingerPointMiddle2);
		Beedrill.addChild(StingerBase);

		BodyMiddle = new ModelRenderer(this, 0, 233);
		BodyMiddle.addBox(-5F, -6F, -5F, 10, 12, 10);
		BodyMiddle.setRotationPoint(0F, 0F, 0F);
		BodyMiddle.setTextureSize(512, 256);
		BodyMiddle.mirror = true;
		setRotation(BodyMiddle, 0F, 0F, 0F);
		BodyHorizontalMiddle = new ModelRenderer(this, 0, 236);
		BodyHorizontalMiddle.addBox(-6F, -5F, -4F, 12, 10, 8);
		BodyHorizontalMiddle.setRotationPoint(0F, 0F, 0F);
		BodyHorizontalMiddle.setTextureSize(512, 256);
		BodyHorizontalMiddle.mirror = true;
		setRotation(BodyHorizontalMiddle, 0F, 0F, 0F);
		BodyVerticalMiddle = new ModelRenderer(this, 0, 233);
		BodyVerticalMiddle.addBox(-4F, -7F, -4F, 8, 14, 8);
		BodyVerticalMiddle.setRotationPoint(0F, 0F, 0F);
		BodyVerticalMiddle.setTextureSize(512, 256);
		BodyVerticalMiddle.mirror = true;
		setRotation(BodyVerticalMiddle, 0F, 0F, 0F);
		BodyFrontMiddle = new ModelRenderer(this, 0, 233);
		BodyFrontMiddle.addBox(-4F, -5F, -6F, 8, 10, 12);
		BodyFrontMiddle.setRotationPoint(0F, 0F, 0F);
		BodyFrontMiddle.setTextureSize(512, 256);
		BodyFrontMiddle.mirror = true;
		setRotation(BodyFrontMiddle, 0F, 0F, 0F);
		LLB1 = new ModelRenderer(this, 200, 0);
		LLB1.addBox(-1F, -2F, -0.5F, 2, 20, 1);
		LLB1.setRotationPoint(6F, 4F, 0F);
		LLB1.setTextureSize(512, 256);
		LLB1.mirror = true;
		setRotation(LLB1, -0.401425728F, 0F, -0.8203047F);
		LLB2 = new ModelRenderer(this, 200, 0);
		LLB2.addBox(-0.5F, -1F, -1F, 1, 19, 2);
		LLB2.setRotationPoint(6F, 4F, 0F);
		LLB2.setTextureSize(512, 256);
		LLB2.mirror = true;
		setRotation(LLB2, -0.401425728F, 0F, -0.8203047F);
		LLCMain = new ModelRenderer(this, 200, 0);
		LLCMain.addBox(-1.3F, -2F, -1.5F, 2, 17, 3);
		LLCMain.setRotationPoint(18.5F, 16.5F, -5F);
		LLCMain.setTextureSize(512, 256);
		LLCMain.mirror = true;
		setRotation(LLCMain, 0F, -0.0698132F, 0F);
		LF1 = new ModelRenderer(this, 200, 0);
		LF1.addBox(0F, 0F, -0.5F, 1, 6, 2);
		LF1.setRotationPoint(17.8F, 31F, -5.5F);
		LF1.setTextureSize(512, 256);
		LF1.mirror = true;
		setRotation(LF1, 0F, 0F, 0F);
		LF2 = new ModelRenderer(this, 200, 0);
		LF2.addBox(0F, 4F, -6.5F, 1, 2, 7);
		LF2.setRotationPoint(17.8F, 31F, -5.5F);
		LF2.setTextureSize(512, 256);
		LF2.mirror = true;
		setRotation(LF2, 0F, 0F, 0F);
		LF3 = new ModelRenderer(this, 200, 0);
		LF3.addBox(0F, 5F, -7.5F, 1, 1, 10);
		LF3.setRotationPoint(17.8F, 31F, -5.5F);
		LF3.setTextureSize(512, 256);
		LF3.mirror = true;
		setRotation(LF3, 0F, 0F, 0F);
		LF4 = new ModelRenderer(this, 200, 0);
		LF4.addBox(-0.5F, 1.5F, 0F, 2, 4, 1);
		LF4.setRotationPoint(17.8F, 31F, -5.5F);
		LF4.setTextureSize(512, 256);
		LF4.mirror = true;
		setRotation(LF4, 0F, 0F, 0F);
		RLB1 = new ModelRenderer(this, 200, 0);
		RLB1.addBox(-0.5F, -1F, -1F, 1, 20, 2);
		RLB1.setRotationPoint(-6F, 4F, 0F);
		RLB1.setTextureSize(512, 256);
		RLB1.mirror = true;
		setRotation(RLB1, -0.401425728F, 0F, 0.8203047F);
		RLB2 = new ModelRenderer(this, 200, 0);
		RLB2.addBox(-1F, -2F, -0.5F, 2, 20, 1);
		RLB2.setRotationPoint(-6F, 4F, 0F);
		RLB2.setTextureSize(512, 256);
		RLB2.mirror = true;
		setRotation(RLB2, -0.401425728F, 0F, 0.8203047F);
		RLCMain = new ModelRenderer(this, 200, 0);
		RLCMain.addBox(-0.3F, -2F, -1.5F, 2, 17, 3);
		RLCMain.setRotationPoint(-18.5F, 16.5F, -5F);
		RLCMain.setTextureSize(512, 256);
		RLCMain.mirror = true;
		setRotation(RLCMain, 0F, 0F, 0F);
		RF1 = new ModelRenderer(this, 200, 0);
		RF1.addBox(-0.5F, 0F, -0.5F, 1, 6, 2);
		RF1.setRotationPoint(-17.8F, 31F, -5.5F);
		RF1.setTextureSize(512, 256);
		RF1.mirror = true;
		setRotation(RF1, 0F, 0F, 0F);
		RF2 = new ModelRenderer(this, 200, 0);
		RF2.addBox(-0.5F, 4F, -6.5F, 1, 2, 7);
		RF2.setRotationPoint(-17.8F, 31F, -5.5F);
		RF2.setTextureSize(512, 256);
		RF2.mirror = true;
		setRotation(RF2, 0F, 0F, 0F);
		RF3 = new ModelRenderer(this, 200, 0);
		RF3.addBox(-0.5F, 5F, -7.5F, 1, 1, 10);
		RF3.setRotationPoint(-17.8F, 31F, -5.5F);
		RF3.setTextureSize(512, 256);
		RF3.mirror = true;
		setRotation(RF3, 0F, 0F, 0F);
		RF4 = new ModelRenderer(this, 200, 0);
		RF4.addBox(-1F, 1.5F, 0F, 2, 4, 1);
		RF4.setRotationPoint(-17.8F, 31F, -5.5F);
		RF4.setTextureSize(512, 256);
		RF4.mirror = true;
		setRotation(RF4, 0F, 0F, 0F);
		LWT = new ModelRenderer(this, 35, -2);
		LWT.addBox(0F, -32F, 0.01F, 35, 35, 0);
		LWT.setRotationPoint(3F, -3F, 6F);
		LWT.setTextureSize(512, 256);
		LWT.mirror = true;
		setRotation(LWT, 0F, 0F, 0F);
		RWB = new ModelRenderer(this, 0, 38);
		RWB.addBox(0F, -11F, 0F, 25, 25, 0);
		RWB.setRotationPoint(-3F, -1F, 6F);
		RWB.setTextureSize(512, 256);
		RWB.mirror = true;
		setRotation(RWB, 0F, -2.670354F, 0F);
		RWT = new ModelRenderer(this, 0, 0);
		RWT.addBox(-35F, -32F, 0.01F, 35, 35, 0);
		RWT.setRotationPoint(-3F, -1F, 6F);
		RWT.setTextureSize(512, 256);
		RWT.mirror = true;
		setRotation(RWT, 0F, 0F, 0F);
		LWB = new ModelRenderer(this, 0, 38);
		LWB.addBox(0F, -11F, 0F, 25, 25, 0);
		LWB.setRotationPoint(3F, -1F, 6F);
		LWB.setTextureSize(512, 256);
		LWB.mirror = true;
		setRotation(LWB, 0F, -0.4712389F, 0F);

		Beedrill.addChild(BodyMiddle);
		Beedrill.addChild(BodyHorizontalMiddle);
		Beedrill.addChild(BodyVerticalMiddle);
		Beedrill.addChild(BodyFrontMiddle);
		Beedrill.addChild(LLB1);
		Beedrill.addChild(LLB2);
		Beedrill.addChild(LLCMain);
		Beedrill.addChild(LF1);
		Beedrill.addChild(LF2);
		Beedrill.addChild(LF3);
		Beedrill.addChild(LF4);
		Beedrill.addChild(RLB1);
		Beedrill.addChild(RLB2);
		Beedrill.addChild(RLCMain);
		Beedrill.addChild(RF1);
		Beedrill.addChild(RF2);
		Beedrill.addChild(RF3);
		Beedrill.addChild(RF4);
		Beedrill.addChild(LWT);
		Beedrill.addChild(RWB);
		Beedrill.addChild(RWT);
		Beedrill.addChild(LWB);

		ArmL = new ModelRenderer(this, "ArmL");
		ArmL.setRotationPoint(6F, -3F, 0F);
		setRotation(ArmL, 0F, 0F, 0F);
		ArmL.mirror = true;
		LAB1 = new ModelRenderer(this, 200, 0);
		LAB1.addBox(-3F, -1F, -0.5F, 13, 2, 1);
		LAB1.setRotationPoint(0F, 0F, 0F);
		LAB1.setTextureSize(512, 256);
		LAB1.mirror = true;
		setRotation(LAB1, 0F, 0F, 0.5759587F);
		LAB2 = new ModelRenderer(this, 200, 0);
		LAB2.addBox(1F, -0.5F, -1F, 11, 1, 2);
		LAB2.setRotationPoint(0F, 0F, 0F);
		LAB2.setTextureSize(512, 256);
		LAB2.mirror = true;
		setRotation(LAB2, 0F, 0F, 0.5759587F);
		LA1 = new ModelRenderer(this, 200, 0);
		LA1.addBox(0.5F, -0.5F, -9F, 2, 1, 9);
		LA1.setRotationPoint(9F, 5.5F, 0F);
		LA1.setTextureSize(512, 256);
		LA1.mirror = true;
		setRotation(LA1, 0F, 0F, 0.5759587F);
		LA2 = new ModelRenderer(this, 200, 0);
		LA2.addBox(1F, -1F, -8F, 1, 2, 7);
		LA2.setRotationPoint(9F, 5.5F, 0F);
		LA2.setTextureSize(512, 256);
		LA2.mirror = true;
		setRotation(LA2, 0F, 0F, 0.5759587F);
		LS2 = new ModelRenderer(this, 0, 100);
		LS2.addBox(-4.5F, -3F, -4.5F, 10, 10, 4);
		LS2.setRotationPoint(9F, 5.5F, -9F);
		LS2.setTextureSize(512, 256);
		LS2.mirror = true;
		setRotation(LS2, 0F, 0F, -0.7853982F);
		LS1 = new ModelRenderer(this, 0, 100);
		LS1.addBox(-3.5F, -2F, -0.5F, 8, 8, 1);
		LS1.setRotationPoint(9F, 5.5F, -9F);
		LS1.setTextureSize(512, 256);
		LS1.mirror = true;
		setRotation(LS1, 0F, 0F, -0.7853982F);
		LS4 = new ModelRenderer(this, 0, 100);
		LS4.addBox(-3.5F, -2F, -8.5F, 8, 8, 4);
		LS4.setRotationPoint(9F, 5.5F, -9F);
		LS4.setTextureSize(512, 256);
		LS4.mirror = true;
		setRotation(LS4, 0F, 0F, -0.7853982F);
		LS6 = new ModelRenderer(this, 0, 100);
		LS6.addBox(-2.5F, -1F, -12.56667F, 6, 6, 4);
		LS6.setRotationPoint(9F, 5.5F, -9F);
		LS6.setTextureSize(512, 256);
		LS6.mirror = true;
		setRotation(LS6, 0F, 0F, -0.7853982F);
		LS8 = new ModelRenderer(this, 0, 100);
		LS8.addBox(-1.5F, 0F, -16.5F, 4, 4, 4);
		LS8.setRotationPoint(9F, 5.5F, -9F);
		LS8.setTextureSize(512, 256);
		LS8.mirror = true;
		setRotation(LS8, 0F, 0F, -0.7853982F);
		LS10 = new ModelRenderer(this, 0, 100);
		LS10.addBox(-0.5F, 1F, -20.5F, 2, 2, 4);
		LS10.setRotationPoint(9F, 5.5F, -9F);
		LS10.setTextureSize(512, 256);
		LS10.mirror = true;
		setRotation(LS10, 0F, 0F, -0.7853982F);
		LS3 = new ModelRenderer(this, 0, 100);
		LS3.addBox(-4F, -2.5F, -6.5F, 9, 9, 2);
		LS3.setRotationPoint(9F, 5.5F, -9F);
		LS3.setTextureSize(512, 256);
		LS3.mirror = true;
		setRotation(LS3, 0F, 0F, -0.7853982F);
		LS5 = new ModelRenderer(this, 0, 100);
		LS5.addBox(-3F, -1.5F, -10.5F, 7, 7, 2);
		LS5.setRotationPoint(9F, 5.5F, -9F);
		LS5.setTextureSize(512, 256);
		LS5.mirror = true;
		setRotation(LS5, 0F, 0F, -0.7853982F);
		LS7 = new ModelRenderer(this, 0, 100);
		LS7.addBox(-2F, -0.5F, -14.5F, 5, 5, 2);
		LS7.setRotationPoint(9F, 5.5F, -9F);
		LS7.setTextureSize(512, 256);
		LS7.mirror = true;
		setRotation(LS7, 0F, 0F, -0.7853982F);
		LS9 = new ModelRenderer(this, 0, 100);
		LS9.addBox(-1F, 0.5F, -18.5F, 3, 3, 2);
		LS9.setRotationPoint(9F, 5.5F, -9F);
		LS9.setTextureSize(512, 256);
		LS9.mirror = true;
		setRotation(LS9, 0F, 0F, -0.7853982F);

		ArmL.addChild(LAB1);
		ArmL.addChild(LAB2);
		ArmL.addChild(LA1);
		ArmL.addChild(LA2);
		ArmL.addChild(LS1);
		ArmL.addChild(LS2);
		ArmL.addChild(LS3);
		ArmL.addChild(LS4);
		ArmL.addChild(LS5);
		ArmL.addChild(LS6);
		ArmL.addChild(LS7);
		ArmL.addChild(LS8);
		ArmL.addChild(LS9);
		ArmL.addChild(LS10);
		Beedrill.addChild(ArmL);

		ArmR = new ModelRenderer(this, "ArmR");
		ArmR.setRotationPoint(-6F, -3F, 0F);
		setRotation(ArmR, 0F, 0F, 0F);
		ArmR.mirror = true;
		RAB1 = new ModelRenderer(this, 200, 0);
		RAB1.addBox(-10F, -1F, -0.5F, 13, 2, 1);
		RAB1.setRotationPoint(0F, 0F, 0F);
		RAB1.setTextureSize(512, 256);
		RAB1.mirror = true;
		setRotation(RAB1, 0F, 0F, -0.5759587F);
		RAB2 = new ModelRenderer(this, 200, 0);
		RAB2.addBox(-11F, -0.5F, -1F, 11, 1, 2);
		RAB2.setRotationPoint(0F, 0F, 0F);
		RAB2.setTextureSize(512, 256);
		RAB2.mirror = true;
		setRotation(RAB2, 0F, 0F, -0.5759587F);
		RA1 = new ModelRenderer(this, 200, 0);
		RA1.addBox(-1F, 0F, -9F, 2, 1, 9);
		RA1.setRotationPoint(-9F, 5.5F, 0F);
		RA1.setTextureSize(512, 256);
		RA1.mirror = true;
		setRotation(RA1, 0F, 0F, -0.5759587F);
		RA2 = new ModelRenderer(this, 200, 0);
		RA2.addBox(-0.5F, -0.5F, -9F, 1, 2, 7);
		RA2.setRotationPoint(-9F, 5.5F, 0F);
		RA2.setTextureSize(512, 256);
		RA2.mirror = true;
		setRotation(RA2, 0F, 0F, -0.5759587F);
		RS2 = new ModelRenderer(this, 0, 100);
		RS2.addBox(-4.9F, -5.2F, -4.5F, 10, 10, 4);
		RS2.setRotationPoint(-9F, 5.5F, -9F);
		RS2.setTextureSize(512, 256);
		RS2.mirror = true;
		setRotation(RS2, 0F, 0F, 0.7853982F);
		RS1 = new ModelRenderer(this, 0, 100);
		RS1.addBox(-3.9F, -4.2F, -0.5F, 8, 8, 1);
		RS1.setRotationPoint(-9F, 5.5F, -9F);
		RS1.setTextureSize(512, 256);
		RS1.mirror = true;
		setRotation(RS1, 0F, 0F, 0.7853982F);
		RS4 = new ModelRenderer(this, 0, 100);
		RS4.addBox(-3.9F, -4.2F, -8.5F, 8, 8, 4);
		RS4.setRotationPoint(-9F, 5.5F, -9F);
		RS4.setTextureSize(512, 256);
		RS4.mirror = true;
		setRotation(RS4, 0F, 0F, 0.7853982F);
		RS6 = new ModelRenderer(this, 0, 100);
		RS6.addBox(-2.9F, -3.2F, -12.56667F, 6, 6, 4);
		RS6.setRotationPoint(-9F, 5.5F, -9F);
		RS6.setTextureSize(512, 256);
		RS6.mirror = true;
		setRotation(RS6, 0F, 0F, 0.7853982F);
		RS8 = new ModelRenderer(this, 0, 100);
		RS8.addBox(-1.9F, -2.2F, -16.5F, 4, 4, 4);
		RS8.setRotationPoint(-9F, 5.5F, -9F);
		RS8.setTextureSize(512, 256);
		RS8.mirror = true;
		setRotation(RS8, 0F, 0F, 0.7853982F);
		RS10 = new ModelRenderer(this, 0, 100);
		RS10.addBox(-0.9F, -1.2F, -20.5F, 2, 2, 4);
		RS10.setRotationPoint(-9F, 5.5F, -9F);
		RS10.setTextureSize(512, 256);
		RS10.mirror = true;
		setRotation(RS10, 0F, 0F, 0.7853982F);
		RS3 = new ModelRenderer(this, 0, 100);
		RS3.addBox(-4.4F, -4.8F, -6.5F, 9, 9, 2);
		RS3.setRotationPoint(-9F, 5.5F, -9F);
		RS3.setTextureSize(512, 256);
		RS3.mirror = true;
		setRotation(RS3, 0F, 0F, 0.7853982F);
		RS5 = new ModelRenderer(this, 0, 100);
		RS5.addBox(-3.4F, -3.8F, -10.5F, 7, 7, 2);
		RS5.setRotationPoint(-9F, 5.5F, -9F);
		RS5.setTextureSize(512, 256);
		RS5.mirror = true;
		setRotation(RS5, 0F, 0F, 0.7853982F);
		RS7 = new ModelRenderer(this, 0, 100);
		RS7.addBox(-2.4F, -2.8F, -14.5F, 5, 5, 2);
		RS7.setRotationPoint(-9F, 5.5F, -9F);
		RS7.setTextureSize(512, 256);
		RS7.mirror = true;
		setRotation(RS7, 0F, 0F, 0.7853982F);
		RS9 = new ModelRenderer(this, 0, 100);
		RS9.addBox(-1.4F, -1.8F, -18.5F, 3, 3, 2);
		RS9.setRotationPoint(-9F, 5.5F, -9F);
		RS9.setTextureSize(512, 256);
		RS9.mirror = true;
		setRotation(RS9, 0F, 0F, 0.7853982F);

		ArmR.addChild(RAB1);
		ArmR.addChild(RAB2);
		ArmR.addChild(RA1);
		ArmR.addChild(RA2);
		ArmR.addChild(RS1);
		ArmR.addChild(RS2);
		ArmR.addChild(RS3);
		ArmR.addChild(RS4);
		ArmR.addChild(RS5);
		ArmR.addChild(RS6);
		ArmR.addChild(RS7);
		ArmR.addChild(RS8);
		ArmR.addChild(RS9);
		ArmR.addChild(RS10);
		Beedrill.addChild(ArmR);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Beedrill.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Beedrill.rotationPointY = MathHelper.cos(.5F * f2) * 5F - 50F;
		LWT.rotateAngleY = MathHelper.cos(3.2F * f2) * .5F - .4F;
		LWB.rotateAngleY = MathHelper.cos(3.5F * f2) * .5F - .6F;
		RWT.rotateAngleY = MathHelper.cos(3.5F * f2 + (float) Math.PI) * .5F + .4F;
		RWB.rotateAngleY = MathHelper.cos(3.5F * f2 + (float) Math.PI) * .5F + 3.6F;
		HeadBase.rotateAngleX = f4 / 57.29578F;
		HeadBase.rotateAngleY = f3 / 57.29578F;
		ArmL.rotateAngleZ = MathHelper.cos(.5F * f2 + (float) Math.PI) * .2F + .3F;
		ArmR.rotateAngleZ = MathHelper.cos(.5F * f2 + .3F) * .2F - .3F;
		StingerBase.rotateAngleX = MathHelper.cos(.5F * f2 + (float) Math.PI
				+ .3F) * .1F;

	}

}