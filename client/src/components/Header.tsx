import { useState } from 'react';
import Menu from './Menu';
import Item from './Item';

export default function Header() {

    const [showMenuItems, setShowMenuItems] = useState(false);

    const mainMenuItems = [
        <Item text='Home' onClick='' />,
        <Item text='Profile' onClick='' />,
        <Item text='Contact' onClick='' />,
        <Item text='About Us' onClick='' />
    ]

    function handleMenuClick() {
        setShowMenuItems(!showMenuItems);
        console.log("Bars clicked!");
    }
    
    return (
        <>
            <header className="header">
                <a href=''><i className="fa-solid fa-archway"></i></a>
                <i className="fa-solid fa-bars" onClick={handleMenuClick}></i>

                {showMenuItems && <Menu list={mainMenuItems} />}
            </header>
        </>
    )
}