/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.GameObject;
import java.awt.Color;
import java.awt.Graphics;
import viewModel.Game;

/**
 *
 * @author Satria Ramadhani
 */
public class Obstacle extends GameObject
{
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Obstacle()
    {
        super(0, 0, "Obstacle");
        super.setHeight(30);
    }
    
    // Constructor with player position.
    public Obstacle(int x, int y)
    {
        super(x, y, "Obstacle");
        super.setHeight(30);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set player shape.
        object.setColor(Color.decode("#FF0000"));
        object.fillRect(x, y, 30, 30);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize player bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
    
}
