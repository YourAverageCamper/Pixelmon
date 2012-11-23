package pixelmon.blocks;

import pixelmon.config.PixelmonItems;
import pixelmon.items.ItemPokemonFossil;
import net.minecraft.src.INetworkManager;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.Packet;
import net.minecraft.src.Packet132TileEntityData;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import net.minecraft.src.WorldServer;

public class TileEntityFossilMachine extends TileEntity {

	public int currentPokeball = -1;
	public int currentFossil = -1;
	public String currentPokeballTexture = "";
	public String currentPokemon = "";
	public boolean pokemonOccupied = false;
	public int fossilTicks = 0;
	public float fossilProgress = 0;
	public int fossilMaxProgress = 1600;
	public int pokemonTicks = 0;
	public float pokemonProgress = 0;
	public int pokemonMaxProgress = 3200;
	public int completionRate = ((int)(((fossilProgress + pokemonProgress) * 2) / 96));
    public float y;
    public boolean staticFlicker = false;
    public float displayFlicker;
    public float displayFlicker2;
    public int dotTicks = 0;
	public String dots = "";
	
	public TileEntityFossilMachine() {
	}
	
    public boolean anyPlayerInRange()
    {
        return this.worldObj.getClosestPlayer((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D, (double)16) != null;
    }
	
    public void updateEntity()
    {
    	if(this.fossilProgress > 0 || this.pokemonProgress > 0){
    		completionRate =((int)(((fossilProgress + pokemonProgress) * 2) / 96));
    	}
    	if(this.currentFossil != -1){
    		if (this.fossilTicks < 0)
    			++fossilTicks;
	    	if (this.fossilTicks == 0 && fossilProgress != fossilMaxProgress){
	    		fossilTicks = 0;
	    		fossilProgress++;
	    	}
	    	else if (fossilProgress >= fossilMaxProgress){
	    		swapFossilForPokemon();
	    	}
    	}
    	if(pokemonOccupied){
    		if (this.pokemonTicks < 0)
    			++pokemonTicks;
    		if (this.pokemonTicks == 0 && pokemonProgress != pokemonMaxProgress){
    			pokemonTicks = 0;
    			pokemonProgress++;
    		}
    	}
    	
    	if(this.dotTicks < 10){
    		dotTicks++;
    	}else if(dots.length() <= 6){
    		this.dotTicks = 0;
    		this.dots = dots + ".";
    	}
    	if(dots.length() >= 6){
    		this.dotTicks = 0;
    		this.dots = "";
    	}
    	
    	if(y == 0)
    		y += 0.01;
    	else
    		y = 0;
    	if(displayFlicker <= 0.8f && displayFlicker2 == 0){
    		this.staticFlicker = true;
    		displayFlicker+=0.1f;
    	}
    	if(displayFlicker >= 0.8f){
    		displayFlicker2 +=0.1f;
    	}
    	if(displayFlicker2 >= 0.5f){
    		this.staticFlicker = false;
    		displayFlicker = 0;
    		displayFlicker2 = 0;
    	}
    	super.updateEntity();
    }
    
    public void swapFossilForPokemon(){
    	if(currentFossil == PixelmonItems.helixFossil.shiftedIndex){
    		this.currentPokemon = ((ItemPokemonFossil)PixelmonItems.helixFossil).getPokemon();
    		this.pokemonOccupied = true;
    		this.currentFossil = -1;
    	}
    	else if(currentFossil == PixelmonItems.domeFossil.shiftedIndex){
    		this.currentPokemon = ((ItemPokemonFossil)PixelmonItems.domeFossil).getPokemon();
    		this.pokemonOccupied = true;
    		this.currentFossil = -1;
    	}
    	else if(currentFossil == PixelmonItems.oldAmber.shiftedIndex){
    		this.currentPokemon = ((ItemPokemonFossil)PixelmonItems.oldAmber).getPokemon();
    		this.pokemonOccupied = true;
    		this.currentFossil = -1;
    	}
    	else if(currentFossil == PixelmonItems.clawFossil.shiftedIndex){
    		this.currentPokemon = ((ItemPokemonFossil)PixelmonItems.clawFossil).getPokemon();
    		this.pokemonOccupied = true;
    		this.currentFossil = -1;
    	}
    	else if(currentFossil == PixelmonItems.rootFossil.shiftedIndex){
    		this.currentPokemon = ((ItemPokemonFossil)PixelmonItems.rootFossil).getPokemon();
    		this.pokemonOccupied = true;
    		this.currentFossil = -1;
    	}
    	else if(currentFossil == PixelmonItems.skullFossil.shiftedIndex){
    		this.currentPokemon = ((ItemPokemonFossil)PixelmonItems.skullFossil).getPokemon();
    		this.pokemonOccupied = true;
    		this.currentFossil = -1;
    	}
    	else if(currentFossil == PixelmonItems.armorFossil.shiftedIndex){
    		this.currentPokemon = ((ItemPokemonFossil)PixelmonItems.armorFossil).getPokemon();
    		this.pokemonOccupied = true;
    		this.currentFossil = -1;
    	}
    	else if(currentFossil == PixelmonItems.coverFossil.shiftedIndex){
    		this.currentPokemon = ((ItemPokemonFossil)PixelmonItems.coverFossil).getPokemon();
    		this.pokemonOccupied = true;
    		this.currentFossil = -1;
    	}
    	else if(currentFossil == PixelmonItems.plumeFossil.shiftedIndex){
    		this.currentPokemon = ((ItemPokemonFossil)PixelmonItems.plumeFossil).getPokemon();
    		this.pokemonOccupied = true;
    		this.currentFossil = -1;
    	}
    }
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("CurrentPokeball", currentPokeball);
		nbt.setInteger("CurrentFossil", currentFossil);
		nbt.setInteger("CompletionRate", completionRate);
		nbt.setFloat("PokemonProgress", pokemonProgress);
		nbt.setFloat("FossilProgress", fossilProgress);
		nbt.setString("CurrentPokemonTexture", currentPokeballTexture);
		nbt.setString("CurrentPokemon", currentPokemon);
		nbt.setBoolean("PokemonOccupied", pokemonOccupied);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		currentPokeball = nbt.getInteger("CurrentPokeball");
		currentFossil = nbt.getInteger("CurrentFossil");
		completionRate = nbt.getInteger("CompletionRate");
		fossilProgress = nbt.getFloat("FossilProgress");
		pokemonProgress = nbt.getFloat("PokemonProgress");
		currentPokeballTexture = nbt.getString("CurrentPokemonTexture");
		currentPokemon = nbt.getString("CurrentPokemon");
		pokemonOccupied = nbt.getBoolean("PokemonOccupied");
	}

	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound var1 = new NBTTagCompound();
		this.writeToNBT(var1);
		return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, var1);
	}

	@Override
	public void onDataPacket(INetworkManager net, Packet132TileEntityData pkt) {
		readFromNBT(pkt.customParam1);
	}

	@Override
	public void receiveClientEvent(int par1, int par2) {
		super.receiveClientEvent(par1, par2);
	}
	
	public World getWorldObj()
	{
		return this.worldObj;
	}
    
}
