package pixelmon.client.gui.pokechecker;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;

import org.lwjgl.opengl.GL11;

import pixelmon.client.gui.GuiResources;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiRenameButtons extends GuiButton
{
    /** Button width in pixels */
    protected int width;

    /** Button height in pixels */
    protected int height;

    /** The x position of this control. */
    public int xPosition;

    /** The y position of this control. */
    public int yPosition;

    /** The string displayed on this control. */
    public String displayString;

    /** ID for this control. */
    public int id;

    /** True if this control is enabled, false to disable. */
    public boolean enabled;

    /** Hides the button completely if false. */
    public boolean drawButton;
    protected boolean field_82253_i;
    
    public GuiRenameButtons(int par1, int par2, int par3, String par4Str)
    {
        this(par1, par2, par3, 82, 25, par4Str);
    }

    public GuiRenameButtons(int par1, int par2, int par3, int par4, int par5, String par6Str)
    {
    	super(par1, par2, par3, par4, par5, par6Str);
        this.enabled = true;
        this.drawButton = true;
        this.id = par1;
        this.xPosition = par2;
        this.yPosition = par3;
        this.width = 49;
        this.height = 25;
        this.displayString = par6Str;
    }

    /**
     * Returns 0 if the button is disabled, 1 if the mouse is NOT hovering over this button and 2 if it IS hovering over
     * this button.
     */
    protected int getHoverState(boolean par1)
    {
        byte var2 = 1;

        if (!this.enabled)
        {
            var2 = 0;
        }
        else if (par1)
        {
            var2 = 2;
        }

        return var2;
    }

    /**
     * Draws this button to the screen.
     */
    public void drawButton(Minecraft par1Minecraft, int par2, int par3)
    {
        if (this.drawButton)
        {
            FontRenderer var4 = par1Minecraft.fontRenderer;
            par1Minecraft.renderEngine.func_110577_a(GuiResources.rename);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.field_82253_i = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            int var5 = this.getHoverState(this.field_82253_i);
            if(getHoverState(field_82253_i) == 2){
            		this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, 115, 49, this.height);
            }
            this.mouseDragged(par1Minecraft, par2, par3);
            int var6 = 0xffffff;

            if (!this.enabled)
            {
                var6 = -6250336;
            }
            else if (this.field_82253_i)
            {
                var6 = 16777120;
            }

            this.drawCenteredString(var4, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, var6);
        }
    }

    /**
     * Fired when the mouse button is dragged. Equivalent of MouseListener.mouseDragged(MouseEvent e).
     */
    protected void mouseDragged(Minecraft par1Minecraft, int par2, int par3) {}

    /**
     * Fired when the mouse button is released. Equivalent of MouseListener.mouseReleased(MouseEvent e).
     */
    public void mouseReleased(int par1, int par2) {}

    /**
     * Returns true if the mouse has been pressed on this control. Equivalent of MouseListener.mousePressed(MouseEvent
     * e).
     */
    public boolean mousePressed(Minecraft par1Minecraft, int par2, int par3)
    {
        return this.enabled && this.drawButton && par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
    }

    public boolean func_82252_a()
    {
        return this.field_82253_i;
    }

    public void func_82251_b(int par1, int par2) {}
}
