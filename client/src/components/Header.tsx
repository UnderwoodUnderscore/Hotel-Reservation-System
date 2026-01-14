import { useState } from 'react';
import Menu from './Menu';
import Item from './Item';

export default function Header({ onPageChange }) {

    const [showMenuItems, setShowMenuItems] = useState(false);

    const mainMenuItems = [
        <Item text='Home' onClick={() => {onPageChange('Home')}} />,
        <Item text='Profile' onClick={() => {onPageChange('Profile')}} />,
        <Item text='Rooms' onClick={() => {onPageChange('Rooms')}} />,
        // <Item text='Contact' onClick={() => {onPageChange('Contact')}} />,
        // <Item text='About Us' onClick={() => {onPageChange('About Us')}} />
    ]

    function handleMenuClick() {
        setShowMenuItems(!showMenuItems);
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