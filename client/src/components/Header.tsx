import { useState } from 'react';
import MenuItems from './MenuItems';

export default function Header({ onProfile }) {

    const [showMenuItems, setShowMenuItems] = useState(false);

    function handleMenu() {
        setShowMenuItems(!showMenuItems);
    }
    
    return (
        <>
            <header className="header">
                {/* <img className="logo" src='https://picsum.photos/40/40' /> */}
                <a href=''><i className="fa-solid fa-archway"></i></a>
                <i className="fa-solid fa-bars" onClick={handleMenu}></i>
            </header>
            {showMenuItems && <MenuItems items={['profile']} onItem={onProfile} />}
        </>
    )
}