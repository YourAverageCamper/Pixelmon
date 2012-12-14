// Date: 8/23/2012 4:30:39 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.MathHelper;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelParas extends ModelBase {
	// fields
	ModelRenderer Body;
	ModelRenderer ButtLayer1;
	ModelRenderer ButtLayer2;
	ModelRenderer Stim1;
	ModelRenderer BaseMushroom1;
	ModelRenderer BaseMushroom2;
	ModelRenderer Stim2;
	ModelRenderer RIGHTFRONTLEG;
	ModelRenderer RIGHTBACKLEG;
	ModelRenderer LEFTFRONTLEG;
	ModelRenderer LEFTBACKLEG;
	ModelRenderer FRONTRIGHTCLAW;
	ModelRenderer FRONTLEFTCLAW;
	ModelRenderer HEADBASE;
	ModelRenderer Leg_part4;
	ModelRenderer Leg_part3;
	ModelRenderer Leg_part6;
	ModelRenderer Leg_part5;
	ModelRenderer Leg_part9;
	ModelRenderer Leg_part10;
	ModelRenderer Leg_part8;
	ModelRenderer Leg_part7;
	ModelRenderer Leg_part1;
	ModelRenderer Leg_part2;
	ModelRenderer claw1;
	ModelRenderer claw2;
	ModelRenderer Head;
	ModelRenderer Eye2;
	ModelRenderer Eye1;
	ModelRenderer pupil1;
	ModelRenderer Nose;
	ModelRenderer Left_tooth1;
	ModelRenderer Left_tooth2;
	ModelRenderer Right_tooth1;
	ModelRenderer Right_tooth2;
	ModelRenderer pupil2;

	public ModelParas() {
		textureWidth = 64;
		textureHeight = 32;
		setTextureOffset("FRONTRIGHTCLAW.Folder2", 0, 0);
		setTextureOffset("FRONTLEFTCLAW.Folder3", 0, 0);
		setTextureOffset("HEADBASE.Folder1", 0, 0);

		Body = new ModelRenderer(this, 8, 8);
		Body.addBox(-2F, 0F, 0F, 5, 4, 6);
		Body.setRotationPoint(0F, 19F, 4F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		ButtLayer1 = new ModelRenderer(this, 18, 0);
		ButtLayer1.addBox(-1.5F, 0.5F, 0F, 4, 3, 5);
		ButtLayer1.setRotationPoint(0F, 19F, 6.5F);
		ButtLayer1.setTextureSize(64, 32);
		ButtLayer1.mirror = true;
		setRotation(ButtLayer1, 0F, 0F, 0F);
		ButtLayer2 = new ModelRenderer(this, 36, 0);
		ButtLayer2.addBox(0F, 0F, 0F, 3, 2, 4);
		ButtLayer2.setRotationPoint(-1F, 20F, 9F);
		ButtLayer2.setTextureSize(64, 32);
		ButtLayer2.mirror = true;
		setRotation(ButtLayer2, 0F, 0F, 0F);
		Stim1 = new ModelRenderer(this, 0, 16);
		Stim1.addBox(0F, 0F, 0F, 1, 2, 1);
		Stim1.setRotationPoint(-2F, 18F, 5F);
		Stim1.setTextureSize(64, 32);
		Stim1.mirror = true;
		setRotation(Stim1, 0F, 0F, -0.3346075F);
		BaseMushroom1 = new ModelRenderer(this, 0, 27);
		BaseMushroom1.addBox(-1F, 0F, 0F, 3, 2, 3);
		BaseMushroom1.setRotationPoint(-2.5F, 16.5F, 4F);
		BaseMushroom1.setTextureSize(64, 32);
		BaseMushroom1.mirror = true;
		setRotation(BaseMushroom1, 0F, 0F, -0.3346075F);
		BaseMushroom2 = new ModelRenderer(this, 0, 22);
		BaseMushroom2.addBox(0F, 0F, 0F, 3, 2, 3);
		BaseMushroom2.setRotationPoint(1.7F, 15.8F, 4F);
		BaseMushroom2.setTextureSize(64, 32);
		BaseMushroom2.mirror = true;
		setRotation(BaseMushroom2, 0F, 0F, 0.3346145F);
		Stim2 = new ModelRenderer(this, 0, 19);
		Stim2.addBox(0F, 0F, 0F, 1, 2, 1);
		Stim2.setRotationPoint(2F, 17.7F, 5F);
		Stim2.setTextureSize(64, 32);
		Stim2.mirror = true;
		setRotation(Stim2, 0F, 0F, 0.3346145F);
		RIGHTFRONTLEG = new ModelRenderer(this, "RIGHTFRONTLEG");
		RIGHTFRONTLEG.setRotationPoint(-2F, 21F, 5.5F);
		setRotation(RIGHTFRONTLEG, 0F, 0F, 0F);
		RIGHTFRONTLEG.mirror = true;
		Leg_part4 = new ModelRenderer(this, 36, 6);
		Leg_part4.addBox(-3.5F, -0.5F, -0.5F, 4, 1, 1);
		Leg_part4.setRotationPoint(-1F, -0.5F, 0F);
		Leg_part4.setTextureSize(64, 32);
		Leg_part4.mirror = true;
		setRotation(Leg_part4, 0F, 0F, -1.226894F);
		Leg_part3 = new ModelRenderer(this, 12, 22);
		Leg_part3.addBox(0F, 0F, -1F, 2, 1, 1);
		Leg_part3.setRotationPoint(-1F, -1F, 0.5F);
		Leg_part3.setTextureSize(64, 32);
		Leg_part3.mirror = true;
		setRotation(Leg_part3, 0F, 0F, 0.4089647F);
		RIGHTBACKLEG = new ModelRenderer(this, "RIGHTBACKLEG");
		RIGHTBACKLEG.setRotationPoint(-2F, 21F, 8.5F);
		setRotation(RIGHTBACKLEG, 0F, 0F, 0F);
		RIGHTBACKLEG.mirror = true;
		Leg_part6 = new ModelRenderer(this, 36, 6);
		Leg_part6.addBox(-3.5F, -0.5F, -0.5F, 4, 1, 1);
		Leg_part6.setRotationPoint(-1F, -0.5F, 0F);
		Leg_part6.setTextureSize(64, 32);
		Leg_part6.mirror = true;
		setRotation(Leg_part6, 0F, 0F, -1.226888F);
		Leg_part5 = new ModelRenderer(this, 12, 22);
		Leg_part5.addBox(0F, 0F, 3F, 2, 1, 1);
		Leg_part5.setRotationPoint(-1F, -1F, -3.5F);
		Leg_part5.setTextureSize(64, 32);
		Leg_part5.mirror = true;
		setRotation(Leg_part5, 0F, 0F, 0.4089647F);
		LEFTFRONTLEG = new ModelRenderer(this, "LEFTFRONTLEG");
		LEFTFRONTLEG.setRotationPoint(3F, 21F, 5.5F);
		setRotation(LEFTFRONTLEG, 0F, 0F, 0F);
		LEFTFRONTLEG.mirror = true;
		Leg_part9 = new ModelRenderer(this, 12, 22);
		Leg_part9.addBox(-2F, 0F, 3F, 2, 1, 1);
		Leg_part9.setRotationPoint(1F, -1F, -3.5F);
		Leg_part9.setTextureSize(64, 32);
		Leg_part9.mirror = true;
		setRotation(Leg_part9, 0F, 0F, -0.3839724F);
		Leg_part10 = new ModelRenderer(this, 36, 6);
		Leg_part10.addBox(-0.5F, -0.5F, -0.5F, 4, 1, 1);
		Leg_part10.setRotationPoint(1F, -0.5F, 0F);
		Leg_part10.setTextureSize(64, 32);
		Leg_part10.mirror = true;
		setRotation(Leg_part10, 0F, 0F, 1.22173F);
		LEFTBACKLEG = new ModelRenderer(this, "LEFTBACKLEG");
		LEFTBACKLEG.setRotationPoint(3F, 21F, 8.5F);
		setRotation(LEFTBACKLEG, 0F, 0F, 0F);
		LEFTBACKLEG.mirror = true;
		Leg_part8 = new ModelRenderer(this, 36, 6);
		Leg_part8.addBox(0F, 0F, -0.5F, 4, 1, 1);
		Leg_part8.setRotationPoint(1F, -1F, 0F);
		Leg_part8.setTextureSize(64, 32);
		Leg_part8.mirror = true;
		setRotation(Leg_part8, 0F, 0F, 1.22173F);
		Leg_part7 = new ModelRenderer(this, 12, 22);
		Leg_part7.addBox(-2F, 0F, 3F, 2, 1, 1);
		Leg_part7.setRotationPoint(1F, -1F, -3.5F);
		Leg_part7.setTextureSize(64, 32);
		Leg_part7.mirror = true;
		setRotation(Leg_part7, 0F, 0F, -0.3839724F);
		FRONTRIGHTCLAW = new ModelRenderer(this, "FRONTRIGHTCLAW");
		FRONTRIGHTCLAW.setRotationPoint(-2F, 19F, 3F);
		setRotation(FRONTRIGHTCLAW, 0F, 0F, 0F);
		FRONTRIGHTCLAW.mirror = true;
		Leg_part1 = new ModelRenderer(this, 12, 24);
		Leg_part1.addBox(0F, -1F, -1F, 6, 2, 2);
		Leg_part1.setRotationPoint(0F, 0F, 0F);
		Leg_part1.setTextureSize(64, 32);
		Leg_part1.mirror = true;
		setRotation(Leg_part1, 0F, 0.72F, 2.3F);
		claw1 = new ModelRenderer(this, 0, 0);
		claw1.addBox(-2F, 0F, 0F, 2, 1, 1);
		claw1.setRotationPoint(-2F, 2.7F, -3.1F);
		claw1.setTextureSize(64, 32);
		claw1.mirror = true;
		setRotation(claw1, 0F, -0.8088379F, -0.6676583F);
		FRONTLEFTCLAW = new ModelRenderer(this, "FRONTLEFTCLAW");
		FRONTLEFTCLAW.setRotationPoint(3F, 19F, 3F);
		setRotation(FRONTLEFTCLAW, 0F, 0F, 0F);
		FRONTLEFTCLAW.mirror = true;
		claw2 = new ModelRenderer(this, 0, 0);
		claw2.addBox(-2F, 0F, -1F, 2, 1, 1);
		claw2.setRotationPoint(2F, 2.7F, -3.1F);
		claw2.setTextureSize(64, 32);
		claw2.mirror = true;
		setRotation(claw2, 0F, -2.3F, -0.66F);
		Leg_part2 = new ModelRenderer(this, 12, 24);
		Leg_part2.addBox(0F, -1F, -1F, 6, 2, 2);
		Leg_part2.setRotationPoint(0F, 0F, 0F);
		Leg_part2.setTextureSize(64, 32);
		Leg_part2.mirror = true;
		setRotation(Leg_part2, 0F, 0.8437445F, 0.7200181F);
		HEADBASE = new ModelRenderer(this, "HEADBASE");
		HEADBASE.setRotationPoint(0.5F, 21F, 4F);
		setRotation(HEADBASE, 0F, 0F, 0F);
		HEADBASE.mirror = true;
		Head = new ModelRenderer(this, 0, 0);
		Head.addBox(-2F, 0F, 0F, 5, 4, 4);
		Head.setRotationPoint(-0.5F, -2F, -4F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Eye2 = new ModelRenderer(this, 18, 22);
		Eye2.addBox(-2F, 0F, 0F, 2, 2, 0);
		Eye2.setRotationPoint(-0.5F, -2.5F, -4.1F);
		Eye2.setTextureSize(64, 32);
		Eye2.mirror = true;
		setRotation(Eye2, 0F, 0F, 0F);
		Eye1 = new ModelRenderer(this, 18, 22);
		Eye1.addBox(-2F, 0F, 0F, 2, 2, 0);
		Eye1.setRotationPoint(2.5F, -2.5F, -4.1F);
		Eye1.setTextureSize(64, 32);
		Eye1.mirror = true;
		setRotation(Eye1, 0F, 0F, 0F);
		pupil1 = new ModelRenderer(this, 32, 20);
		pupil1.addBox(-2F, 0F, 0F, 1, 1, 0);
		pupil1.setRotationPoint(3F, -2F, -4.2F);
		pupil1.setTextureSize(64, 32);
		pupil1.mirror = true;
		setRotation(pupil1, 0F, 0F, 0F);
		Nose = new ModelRenderer(this, 0, 8);
		Nose.addBox(-1F, 0F, 0F, 2, 1, 1);
		Nose.setRotationPoint(0F, -0.5F, -4.7F);
		Nose.setTextureSize(64, 32);
		Nose.mirror = true;
		setRotation(Nose, 0F, 0F, 0F);
		Left_tooth1 = new ModelRenderer(this, 0, 13);
		Left_tooth1.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		Left_tooth1.setRotationPoint(1.5F, 0.5F, -3.5F);
		Left_tooth1.setTextureSize(64, 32);
		Left_tooth1.mirror = true;
		setRotation(Left_tooth1, 0F, 0.5235988F, 0F);
		Left_tooth2 = new ModelRenderer(this, 0, 13);
		Left_tooth2.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		Left_tooth2.setRotationPoint(1.2F, 1.5F, -3.7F);
		Left_tooth2.setTextureSize(64, 32);
		Left_tooth2.mirror = true;
		setRotation(Left_tooth2, 0F, 0.5576792F, 0F);
		Right_tooth1 = new ModelRenderer(this, 0, 10);
		Right_tooth1.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		Right_tooth1.setRotationPoint(-1.5F, 0.5F, -3.5F);
		Right_tooth1.setTextureSize(64, 32);
		Right_tooth1.mirror = true;
		setRotation(Right_tooth1, 0F, -0.5205006F, 0F);
		Right_tooth2 = new ModelRenderer(this, 0, 10);
		Right_tooth2.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		Right_tooth2.setRotationPoint(-1.2F, 1.5F, -3.7F);
		Right_tooth2.setTextureSize(64, 32);
		Right_tooth2.mirror = true;
		setRotation(Right_tooth2, 0F, -0.5205006F, 0F);
		pupil2 = new ModelRenderer(this, 32, 20);
		pupil2.addBox(-2F, 0F, 0F, 1, 1, 0);
		pupil2.setRotationPoint(0F, -2F, -4.2F);
		pupil2.setTextureSize(64, 32);
		pupil2.mirror = true;
		setRotation(pupil2, 0F, 0F, 0F);
		RIGHTFRONTLEG.addChild(Leg_part4);
		RIGHTFRONTLEG.addChild(Leg_part3);
		RIGHTBACKLEG.addChild(Leg_part6);
		RIGHTBACKLEG.addChild(Leg_part5);
		LEFTFRONTLEG.addChild(Leg_part9);
		LEFTFRONTLEG.addChild(Leg_part10);
		LEFTBACKLEG.addChild(Leg_part8);
		LEFTBACKLEG.addChild(Leg_part7);
		FRONTRIGHTCLAW.addChild(Leg_part1);
		FRONTRIGHTCLAW.addChild(claw1);
		FRONTLEFTCLAW.addChild(Leg_part2);
		FRONTLEFTCLAW.addChild(claw2);
		HEADBASE.addChild(Head);
		HEADBASE.addChild(Eye2);
		HEADBASE.addChild(Eye1);
		HEADBASE.addChild(pupil1);
		HEADBASE.addChild(Nose);
		HEADBASE.addChild(Left_tooth1);
		HEADBASE.addChild(Left_tooth2);
		HEADBASE.addChild(Right_tooth1);
		HEADBASE.addChild(Right_tooth2);
		HEADBASE.addChild(pupil2);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		ButtLayer1.render(f5);
		ButtLayer2.render(f5);
		Stim1.render(f5);
		BaseMushroom1.render(f5);
		BaseMushroom2.render(f5);
		Stim2.render(f5);
		RIGHTFRONTLEG.render(f5);
		RIGHTBACKLEG.render(f5);
		LEFTFRONTLEG.render(f5);
		LEFTBACKLEG.render(f5);
		FRONTRIGHTCLAW.render(f5);
		FRONTLEFTCLAW.render(f5);
		HEADBASE.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		HEADBASE.rotateAngleY = f3 / (180F / (float) Math.PI);
		HEADBASE.rotateAngleX = f4 / (180F / (float) Math.PI);
		Right_tooth1.rotateAngleY = MathHelper.cos(f2 * 2F + (float) Math.PI) * .3F;
		Right_tooth2.rotateAngleY = MathHelper.cos(f2 * 2F) * .3F;
		Left_tooth1.rotateAngleY = MathHelper.cos(f2 * 2F) * .3F;
		Left_tooth2.rotateAngleY = MathHelper.cos(f2 * 2F + (float) Math.PI) * .3F;
		LEFTFRONTLEG.rotateAngleY = MathHelper.cos(f * 2F + (float) Math.PI) * f1 * .8F;
		LEFTBACKLEG.rotateAngleY = MathHelper.cos(f * 2F) * f1 * .8F;
		RIGHTFRONTLEG.rotateAngleY = MathHelper.cos(f * 2F) * f1 * .8F;
		RIGHTBACKLEG.rotateAngleY = MathHelper.cos(f * 2F + (float) Math.PI) * f1 * .8F;
		LEFTFRONTLEG.rotateAngleZ = MathHelper.sin(f * 2F + (float) Math.PI) * f1 * .5F;
		LEFTBACKLEG.rotateAngleZ = MathHelper.sin(f * 2F) * f1 * .5F;
		RIGHTFRONTLEG.rotateAngleZ = MathHelper.sin(f * 2F) * f1 * .5F;
		RIGHTBACKLEG.rotateAngleZ = MathHelper.sin(f * 2F + (float) Math.PI) * f1 * .5F;
	}

}
