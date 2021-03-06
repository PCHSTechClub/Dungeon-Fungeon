package com.blogspot.darokrithia.dungeonfungeon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by hkeene17 on 1/12/16.
 */
public class InventoryActivity extends AppCompatActivity {
    public static int itemToSwitch = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        //Sets text to being the current total stats for player in the inventory screen.

        ((TextView)findViewById(R.id.NameInventory)).setText(RoomActivity.player.getName()); //name
        ((TextView)findViewById(R.id.HealthInventory)).setText("HP: " + RoomActivity.player.getCurrentHP() + "/" + RoomActivity.player.getMaxHP() + ""); //CurrentHP over MaxHP
        ((TextView)findViewById(R.id.AgilityInventory)).setText("Speed: " + RoomActivity.player.getBaseSpeed()); //Speed
        ((TextView)findViewById(R.id.DefenceInventory)).setText("Armor: " + RoomActivity.player.getDefence()); //Defence
        ((TextView)findViewById(R.id.AttackInventory)).setText("Attack: " + RoomActivity.player.getAttack()); //Attack
        ((TextView)findViewById(R.id.IntelligenceInventory)).setText("Intelligence: " + RoomActivity.player.getIntelligence()); //Intelligence

    } // Goes to the activity corresponding to the equipment slot.

    public void onHelmetSlotClick(View v) {
        if (v.getId() == R.id.HelmetInventory) {
            itemToSwitch = 0;                                                           //Sets item to switch to Helmet armor
            Intent i = new Intent(InventoryActivity.this, ItemSwitcherActivity.class);  //Helmet Button
            startActivity(i);
        }
    }
    public void onArmorSlotClick(View v) {
        if (v.getId() == R.id.ArmorInventory) {
            itemToSwitch = 1;                                                           //Sets item to switch to Chest armor
            Intent i = new Intent(InventoryActivity.this, ItemSwitcherActivity.class);  //Armor Button
            startActivity(i);
        }
    }
    public void onLeggingsSlotClick(View v) {
        if (v.getId() == R.id.LeggingsInventory) {
            itemToSwitch = 2;                                                           //Sets item to switch to Leggings
            Intent i = new Intent(InventoryActivity.this, ItemSwitcherActivity.class);  //Leggings Button
            startActivity(i);
        }
    }
    public void onBootsSlotClick(View v) {
        if (v.getId() == R.id.BootsInventory) {
            itemToSwitch = 3;                                                           //Sets item to switch to Boots
            Intent i = new Intent(InventoryActivity.this, ItemSwitcherActivity.class);  //Boots Button
            startActivity(i);
        }
    }
    public void onLeftHandSlotClick(View v) {
        if (v.getId() == R.id.LeftHand) {
            itemToSwitch = 4;                                                           //Sets item to switch to Left item
            Intent i = new Intent(InventoryActivity.this, ItemSwitcherActivity.class);  //Left Hand Button
            startActivity(i);
        }
    }
    public void onRightHandSlotClick(View v) {
        if (v.getId() == R.id.RightHand) {
            itemToSwitch = 4;                                                           //Sets item to switch to Right item
            Intent i = new Intent(InventoryActivity.this, ItemSwitcherActivity.class);  //Right Hand Button
            startActivity(i);
        }
    }
    public void onInventoryBackClick(View v) {
        if (v.getId() == R.id.InventoryBackButton) {
            Intent i = new Intent(InventoryActivity.this, RoomActivity.class);
            startActivity(i);
        }
    }
}
